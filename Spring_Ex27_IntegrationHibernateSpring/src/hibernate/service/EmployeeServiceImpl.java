package hibernate.service;

import java.util.List;

import hibernate.dao.EmployeeDao;
import hibernate.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> emList = employeeDao.getAllEmployees();
		return emList;
	}

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}
}
