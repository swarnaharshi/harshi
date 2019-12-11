package pkg;

public class Employee {
	private int eid;
	private String ename;
	private double esalary;
	private Address eaddress;
	private Passport epassport;
	
	public Employee()
	{
		System.out.println("-----------------*****&&&&&&&&&&&&&&&");
	}
	public void displayEmployee()
	{
		
		System.out.println("Eid : " + eid);
		System.out.println("Emp Name : " + ename);
		System.out.println("Emp Salary : " + esalary);
		eaddress.displayAddress();
		epassport.displayPassport();
		
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
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	

	public Address getEaddress() {
		return eaddress;
	}

	public void setEaddress(Address eaddress) {
		this.eaddress = eaddress;
	}

	public Passport getEpassport() {
		return epassport;
	}

	public void setEpassport(Passport epassport) {
		this.epassport = epassport;
	}
	
}