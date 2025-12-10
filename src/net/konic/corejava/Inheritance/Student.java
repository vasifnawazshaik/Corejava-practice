package net.konic.corejava.Inheritance;

public class Student extends Person {
		void show (int rollno) {
		System.out.println("rollnum:" + rollno);
		
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.details("rahul");
		obj.details(20);
		obj.show(115);
	}
	

}
