package net.konic.corejava.Overloading;

public class RideBooking {
	/* Overload bookRide() with carType and passenger  count.

	INPUT:
	bookRide("Ameerpet", "Hitech City")
	bookRide("Ameerpet", "Hitech City", "SUV")
	bookRide("Ameerpet", "Hitech City", 3)

	OUTPUT:
	Ride booked from Ameerpet to Hitech City
	SUV ride booked from Ameerpet to Hitech City
	Ride booked for 3 passengers from Ameerpet to Hitech City
*/
      void bookRide(String a, String b) {
    	  System.out.println("Ride booked From "+ a + " to " + b);
      }
       void bookRide1(String a,String b) {
    	   System.out.println("SUV ride booked from " + a + " to " + b);
    	   
      }
        void bookRide2(String a,String b,String c) {
        	System.out.println("Ride booked for " + a  + b + " to" + c);
        }
        public static void main(String[] args) {
			RideBooking obj = new RideBooking();
			obj.bookRide("Ameerpet", "Hightech city");
			obj.bookRide1("Ameerpet", "Hightech city");
			obj.bookRide2(" 3 passengers from ", "Ameerpet", " Hightech city ");
			
			
		}
		
			
		
}
