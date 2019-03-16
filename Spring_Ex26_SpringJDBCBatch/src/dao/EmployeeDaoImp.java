package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImp{

	@Autowired
	private JdbcTemplate jdbcTemplate;

//	@Override
//	public int getEmployeeCount() {
//		String sql = "select count(*) from employee";
//		return jdbcTemplate.queryForObject(sql,new Object[] { empId });
//	}

	
	public void insertEmployees(final List<Employee> employees) {
		jdbcTemplate.batchUpdate("INSERT INTO employee "
                + "(EmpId, Name) VALUES (?, ?)", new BatchPreparedStatementSetter()
                {
                    public void setValues(PreparedStatement ps, int i) throws SQLException{
                        Employee employee = employees.get(i);
                        ps.setLong(1, employee.getEmpId());
                        ps.setString(2, employee.getName());
                    }
                    public int getBatchSize(){
                        return employees.size();
                    }
                });
	}
        public int getEMployeeCount(){
            String sql = "select count(*) from employee";
            return jdbcTemplate.queryForInt(sql);
        }

	
}
