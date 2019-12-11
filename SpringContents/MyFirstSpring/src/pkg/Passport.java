package pkg;


public class Passport {
	String pcountry;
	String pidate;
	String pedate;
	
	public void displayPassport()
	{
		System.out.println(pcountry + " " + pidate + " " + pedate);
	}
	
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public String getPidate() {
		return pidate;
	}
	public void setPidate(String pidate) {
		this.pidate = pidate;
	}
	public String getPedate() {
		return pedate;
	}
	public void setPedate(String pedate) {
		this.pedate = pedate;
	}
	
	
}
