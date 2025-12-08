package net.konic.corejava.Overloading;

public class StudentRegistration {
	/*Overload register() to accept 1, 2, or 3 parameters.

	INPUT:
	register("Rahul")
	register("Rahul", 20)
	register("Rahul", 20, "Hyderabad")

	OUTPUT:
	Registered: Rahul
	Registered: Rahul, Age: 20
	Registered: Rahul, Age: 20, City: Hyderabad
*/
	void register(String a) {
		System.out.println("Register " + a);
	}
	void register(String a, int b) {
		System.out.println("Register " + a  + " Age:" + b);	
	}
	void register(String a, int b, String c) {
		System.out.println("Register " +  a  + b +" city:"+c);
		
	}
	public static void main(String[] args) {
		StudentRegistration studentRegistration = new StudentRegistration();
		studentRegistration.register("wasif");
		studentRegistration.register("wasif", 20 );
		studentRegistration.register("wasif", 20 , " hyderabad" );
	}
}
