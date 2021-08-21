package Dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Util.SessionUtil;
import pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	public void insertEmp(Employee employee) throws SQLException {
		Transaction transaction = null;
		try (Session session= SessionUtil.getFactory().openSession()) {
			// start a transaction
		 transaction  = session.beginTransaction();
			// save the student object
			session.save(employee);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}

	public Employee selectEmp(int id) {
		Transaction transaction = null;
		Employee employee = null;
		try (Session session = SessionUtil.getFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			employee = session.get(Employee.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee;
	}

	public List<Employee> selectAllEmp() {
		Transaction transaction = null;
		List<Employee> employee = null;
		try (Session session = SessionUtil.getFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			employee = session.createQuery("from employee").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return employee;
	}

	public boolean deleteEmp(int id) throws SQLException {
		Transaction transaction = null;
		try (Session session = SessionUtil.getFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a todo object
			Employee employee = session.get(Employee.class, id);
			if (employee != null) {
				session.delete(employee);
				System.out.println("employee is deleted");
				return true;
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return false;}

	public void updateEmp(Employee employee) throws SQLException {
		Transaction transaction = null;
		try (Session session = SessionUtil.getFactory().openSession()) {
			Employee emp= selectEmp(employee.getEmpId());
			emp.setEmpName(employee.getEmpName());
			emp.setEmpMobile(employee.getEmpMobile());
			emp.setEmpAddress(employee.getEmpAddress());
			emp.setEmpSalary(employee.getEmpSalary());
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.update(emp);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
		
	}


