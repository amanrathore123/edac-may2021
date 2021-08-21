package crud;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import pojo.Employee;

public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao employeeDao = new EmployeeDaoImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName = request.getParameter("empName");
		String empMobile = request.getParameter("empMobile");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String empAddress = request.getParameter("empAddress");
		Employee newEmp = new Employee(empName, empMobile, empAddress, empSalary);
		try {
			employeeDao.insertEmp(newEmp);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		response.sendRedirect("profile.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
