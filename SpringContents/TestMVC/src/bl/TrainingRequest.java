package bl;

public class TrainingRequest {

	private String request_id;
	private String request_pm_name;
	private String request_pm_vertical;
	private String request_technology;
	private String request_date;
	private int approx_participants;
	private String training_location;
	private String training_type;
	
	
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getRequest_pm_name() {
		return request_pm_name;
	}
	public void setRequest_pm_name(String request_pm_name) {
		this.request_pm_name = request_pm_name;
	}
	public String getRequest_pm_vertical() {
		return request_pm_vertical;
	}
	public void setRequest_pm_vertical(String request_pm_vertical) {
		this.request_pm_vertical = request_pm_vertical;
	}
	public String getRequest_technology() {
		return request_technology;
	}
	public void setRequest_technology(String request_technology) {
		this.request_technology = request_technology;
	}
	public String getRequest_date() {
		return request_date;
	}
	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
	public int getApprox_participants() {
		return approx_participants;
	}
	public void setApprox_participants(int approx_participants) {
		this.approx_participants = approx_participants;
	}
	public String getTraining_location() {
		return training_location;
	}
	public void setTraining_location(String training_location) {
		this.training_location = training_location;
	}
	public String getTraining_type() {
		return training_type;
	}
	public void setTraining_type(String training_type) {
		this.training_type = training_type;
	}
	
}