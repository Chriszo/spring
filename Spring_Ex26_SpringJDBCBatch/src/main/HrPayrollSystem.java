package main;


import dao.EmployeeDaoImp;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HrPayrollSystem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring.xml");
		EmployeeDaoImp employeeDaoImp =(EmployeeDaoImp)context.getBean("employeeDaoImp");

	List<Employee>employeeList = new ArrayList<Employee>();
        Employee employee1 = new Employee(10001, "Michail");
        Employee employee2 = new Employee(23330, "George");  
        Employee employee3 = new Employee(12345, "Kostas");
        employeeList.add(employee1);
         employeeList.add(employee2);
          employeeList.add(employee3);
          employeeDaoImp.insertEmployees(employeeList);
          System.out.println(employeeDaoImp.getEMployeeCount());
        

	}

}
