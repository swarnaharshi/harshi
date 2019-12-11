package pkg;

public class Address {
	private String street;
	private String state;
	private String pincode;
	
	public Address(String street,String state,String pincode)
	{
		this.street=street;
		this.state=state;
		this.pincode=pincode;
	}
	
	public void displayAddress()
	{
		System.out.println(street + " " + state + " " + pincode) ;
	}
	
	
}
