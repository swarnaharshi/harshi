package pkg;

public class EmpData {

	private int eid;
	private String ename;
	private String ecity;
	private int esalary;
	
	public void display()
	{
		System.out.println(eid + " " + ename + " " + ecity + " "  + esalary);
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	
	
}
