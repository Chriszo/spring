package dao;

import model.Employee;

public interface EmployeeDao {

	void createEmployee();

	int getEmployeeCount();

	int insertEmployees(Employee employee);

	int deleteEmployeeById(int empId);

	Employee getEmployeeById(int empId);

}
