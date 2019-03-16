package main;

import hibernate.model.Employee;
import hibernate.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"app-context.xml");

		EmployeeService employeeService = context.getBean(
				"employeeServiceImpl", EmployeeService.class);

		// insert employee
		Employee emp = new Employee();
		emp.setId(1003);
		emp.setName("Namrata");
		emp.setEmail("abc@abc.com");
		employeeService.insertEmployee(emp);

		// fetch all employee
		for (Employee employee : employeeService.getAllEmployees())
			System.out.println(employee);
	}

}
