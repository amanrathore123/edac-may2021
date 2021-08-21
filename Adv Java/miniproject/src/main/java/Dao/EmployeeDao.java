package Dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Employee;

public interface EmployeeDao {

	void insertEmp(Employee employee) throws SQLException;

	Employee selectEmp(int id );

	List<Employee> selectAllEmp();

	boolean deleteEmp(int id) throws SQLException;

	void updateEmp(Employee employee) throws SQLException;

}
