package net.konic.corejava.Constructors;

public class BusTicket {
	
	String passenger="vasif";
	static int fare=500;
	static String companyName="IRCTC";
	
	public BusTicket(String passenger) {

		this.passenger = passenger;
	}
	
	public static void main(String[] args) {
		BusTicket b1=new BusTicket("Vasif");
		System.out.println("total Fare : "+ fare);
		System.out.println("passenger name : "+ b1.passenger);
		System.out.println("Company : "+ b1.companyName);
		
	}
	
	
	

}
