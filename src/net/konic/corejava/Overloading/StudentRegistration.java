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
	void register(String name) {
		System.out.println("Register: " + name);
	}
	void register(String name, int age) {
		System.out.println("Register: " + name  + " Age:" + age);	
	}
	void register(String name, int age, String city) {
		System.out.println("Register: " +  name  + age +" city:"+city);
		
	}
	public static void main(String[] args) {
		StudentRegistration studentRegistration = new StudentRegistration();
		studentRegistration.register("wasif");
		studentRegistration.register("wasif", 20 );
		studentRegistration.register("wasif", 20 , " hyderabad" );
	}
}
