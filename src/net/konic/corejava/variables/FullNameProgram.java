package net.konic.corejava.variables;
import java.util.Scanner;

public class FullNameProgram{
	
	String firstName;
	String lastName;
	
	void readMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter FirstName : ");
		System.out.println("Enter LastName : ");
		String f = sc.nextLine();
		String l= sc.nextLine();
		firstName=f;
		lastName=l;
				
	}
	void fullName() {
		System.out.println("FullNAme : "+firstName+" "+lastName);
	}
	
	public static void main(String[] args) {
		FullNameProgram  r = new FullNameProgram();
		r.readMethod();
		r.fullName();
	}

	
	
	
	

}
