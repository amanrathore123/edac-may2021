package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empMobile;
	private String empAddress;
	private double empSalary;
	@ManyToOne
	private Admin admin;
	
	public Admin getAdmin() {
		return admin;
	}

	public Employee(String empName, String empMobile, String empAddress, double empSalary) {
		super();
		this.empName = empName;
		this.empMobile = empMobile;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMobile=" + empMobile + ", empAddress="
				+ empAddress + ", empSalary=" + empSalary + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	
}