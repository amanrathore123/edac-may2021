package crud;

import java.io.IOException;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.hibernate.Session;
import org.hibernate.Transaction;



import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Util.SessionUtil;
import pojo.Employee;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Session session = SessionUtil.getFactory().openSession();
		Transaction txn = session.beginTransaction();
		
		Employee emp1 = session.get(Employee.class, Integer.parseInt(request.getParameter("empId")));
		
		emp1.setEmpName(request.getParameter("empName"));
		emp1.setEmpAddress(request.getParameter("empAddress"));
		emp1.setEmpSalary(Double.parseDouble(request.getParameter("empSalary")));
		emp1.setEmpMobile(request.getParameter("empMobile"));
		
		session.update(emp1);
		
		txn.commit();
		session.close();
		response.sendRedirect("profile.jsp");
	}
	
	
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("empId"));
		String empName = request.getParameter("empName");
		String empMobile = request.getParameter("empMobile");
		double empSalary = Double.parseDouble(request.getParameter("empSalary"));
		String empAddress = request.getParameter("empAddress");

		Employee newEmp = new Employee(empName, empMobile, empAddress, empSalary);
		try {
			employeeDao.updateEmp(newEmp);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
