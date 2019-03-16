package main;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public class HrPayrollSystem {

	public static void main(String[] args) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		// create employee table
		employeeDao.createEmployee();
		// insert into employee table
		employeeDao.insertEmployee(new Employee(1, "Michail"));
		// get employee based on id
		Employee employee = employeeDao.getEmployeeById(1);
		System.out.println("Employee name: " + employee.getName());
	}
}
