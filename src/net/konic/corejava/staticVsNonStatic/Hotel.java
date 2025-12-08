package net.konic.corejava.staticVsNonStatic;

public class Hotel {
	static String hotelname = "Taj krishna";
	int roomnumber;
	public static void main(String[] args) {
		System.out.println("hotelname:"+ Hotel.hotelname);
		Hotel h1 = new Hotel();
		h1.roomnumber = 420;
		System.out.println("roomnumber(1):"+ h1.roomnumber);
		Hotel h2 = new Hotel();
		h2.roomnumber = 220;
		System.out.println("roomnumber(2):"+ h2.roomnumber);
		
	}
	

}
