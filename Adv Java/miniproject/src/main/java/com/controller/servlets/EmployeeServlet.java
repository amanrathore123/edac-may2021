package com.controller.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import pojo.Employee;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDao employeeDao;

	public void init() {
		employeeDao = new EmployeeDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String action= request.getServletPath();
		System.out.print("inside servlet :" + request.getServletPath());
		System.out.print("inside servlet :" + request.getLocalAddr());
		System.out.print("inside servlet :" + request.getPathTranslated());
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertEmp(request, response);
				break;
			case "/delete":
				deleteEmp(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateEmp(request, response);
				break;
			default:
				listEmp(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);}
		}

	private void listEmp(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Employee> listEmp = employeeDao.selectAllEmp();
		request.setAttribute("listEmp", listEmp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/emplist.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/emp-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee existingEmp = employeeDao.selectEmp(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/emp-form.jsp");
		request.setAttribute("emp", existingEmp);
		dispatcher.forward(request, response);
	}

	private void insertEmp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		System.out.print("Inside empServlet insert()");
		String empName = request.getParameter("empName");
		String empMobile = request.getParameter("empMobile");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String empAddress = request.getParameter("empAddress");
		Employee newEmp = new Employee(empName, empMobile, empAddress, empSalary);
		employeeDao.insertEmp(newEmp);
		response.sendRedirect("profile.jsp");
	}

	private void updateEmp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		System.out.print("Inside empServlet update()");
		int id = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		String empMobile = request.getParameter("empMobile");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String empAddress = request.getParameter("empAddress");

		Employee newEmp = new Employee(empName, empMobile, empAddress, empSalary);
		employeeDao.insertEmp(newEmp);
		response.sendRedirect("profile.jsp");
	}

	private void deleteEmp(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("empId"));
		employeeDao.deleteEmp(id);
		response.sendRedirect("profile.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
