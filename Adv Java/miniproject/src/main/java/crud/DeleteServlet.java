package crud;

import java.io.IOException;
import java.sql.SQLException;

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

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = SessionUtil.getFactory().openSession();
		Transaction txn = session.beginTransaction();
		System.out.print(request.getParameter("empId"));
		int id= Integer.parseInt(request.getParameter("empId"));
		System.out.print("inside delete  "+id);
		Employee emp1 = session.get(Employee.class, id);
		session.delete(emp1);
		
		txn.commit();
		session.close();
		response.sendRedirect("profile.jsp");
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
}
}