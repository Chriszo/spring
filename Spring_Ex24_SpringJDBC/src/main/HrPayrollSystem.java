package main;

import dao.EmployeeDao;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrPayrollSystem {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring.xml");
		EmployeeDao employeeDao = context.getBean("employeeDaoImpl",
				EmployeeDao.class);
		// create employee table
		employeeDao.createEmployee();
		// insert into employee table
		employeeDao.insertEmployee(new Employee(1, "Michail"));
		// get employee based on id
		Employee employee = employeeDao.getEmployeeById(1);
		System.out.println("Employee name: " + employee.getName());
	}
}
