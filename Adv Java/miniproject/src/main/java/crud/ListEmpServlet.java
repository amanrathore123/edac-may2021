package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import Util.SessionUtil;
import pojo.Employee;


public class ListEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao employeeDao = new EmployeeDaoImpl();   
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = SessionUtil.getFactory().openSession();
		
		Transaction transaction = null;
		List<Employee> employee = null;
		
		transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		employee=query.getResultList();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		for(Employee e: employee) {
		System.out.println(e);
		}
		HttpSession httpsession = request.getSession();
		httpsession.setAttribute("list", employee);
		response.sendRedirect("list.jsp");
		transaction.commit();
	}
	
	
	
	
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> listEmp = employeeDao.selectAllEmp();
		request.setAttribute("listEmp", listEmp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/emplist.jsp");
		dispatcher.forward(request, response);
	}
*/

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
