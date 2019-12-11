package pkg;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<EmpData> {

	@Override
	public EmpData mapRow(ResultSet result, int arg1) throws SQLException {
		
		EmpData data = new EmpData();
		
		data.setEid(result.getInt(1));
		data.setEname(result.getString(2));
		data.setEcity(result.getString(3));
		data.setEsalary(result.getInt(4));
		
		return data;
	}

}