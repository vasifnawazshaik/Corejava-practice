package net.konic.corejava.Overloading;

public class RideBooking {
	private static String suv;

	/*
	 * Overload bookRide() with carType and passenger count.
	 * 
	 * INPUT: bookRide("Ameerpet", "Hitech City") bookRide("Ameerpet",
	 * "Hitech City", "SUV") bookRide("Ameerpet", "Hitech City", 3)
	 * 
	 * OUTPUT: Ride booked from Ameerpet to Hitech City SUV ride booked from
	 * Ameerpet to Hitech City Ride booked for 3 passengers from Ameerpet to Hitech
	 * City
	 */
	void bookRide(String area1, String area2) {
		System.out.println("Ride booked From " + area1 + " to " + area2);
	}

	void bookRide(String area1, String area2, String area3) {
		System.out.println(area1 + " ride booked from " + area2 + " to " + area3 );

	}

	void bookRide(String area1, String area2, int area3) {
		System.out.println("Ride booked for 3 passengers from  " + area1 + " to  " + area2);
	}

	public static void main(String[] args) {
		RideBooking obj = new RideBooking();
		obj.bookRide("Ameerpet", "Hightech city");
		obj.bookRide("suv", "Ameerpet", "Hightech city");
		obj.bookRide("Ameerpet", "Hightech city", 3);

	}
}
