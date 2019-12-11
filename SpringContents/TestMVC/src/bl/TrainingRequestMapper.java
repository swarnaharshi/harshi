package bl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TrainingRequestMapper implements RowMapper<TrainingRequest> 
{

	@Override
	public TrainingRequest mapRow(ResultSet result, int arg1) throws SQLException {
		
		TrainingRequest tr = new TrainingRequest();
		tr.setRequest_id(result.getString(1));
		tr.setRequest_pm_name(result.getString(2));
		tr.setRequest_pm_vertical(result.getString(6));
		tr.setRequest_technology(result.getString(3));
		tr.setRequest_date(result.getString(4));
		tr.setApprox_participants(result.getInt(5));
		tr.setTraining_location(result.getString(7));
		tr.setTraining_type(result.getString(8));
		
		return tr;
	}

}
