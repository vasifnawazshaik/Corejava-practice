package net.konic.corejava.constructors;

public class TrainTicket {
	
	String passenger="vasif";
	static int fare=500;
	static String companyName="IRCTC";
	
	public TrainTicket(String passenger) {

		passenger = passenger;
	}
	
	public static void main(String[] args) {
		TrainTicket b1=new TrainTicket("Vasif");
		System.out.println("total Fare : "+ fare);
		System.out.println("passenger name : "+ b1.passenger);
		System.out.println("Company : "+ b1.companyName);
		
	}
	
	
	

}
