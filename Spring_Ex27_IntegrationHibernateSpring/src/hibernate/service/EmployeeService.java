package hibernate.service;

import java.util.List;
import hibernate.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();

	public void insertEmployee(Employee employee);
}
