package hibernate.dao;

import java.util.List;
import hibernate.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();

	public void insertEmployee(Employee employee);
}
