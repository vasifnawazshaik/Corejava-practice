package net.konic.corejava.stringtypes;

public class Immutability {
	public static void main(String[] args) {
		String password= "admin123";
		password.concat("758");
		System.out.println("Password remains: "+password);
	
	}

}
