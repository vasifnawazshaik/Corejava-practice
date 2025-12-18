package net.konic.corejava.stringtypes;

public class ConstantPoolCheck {
	public static void main(String[] args) {
		String a = "Hotel";
		String b = "Hotel";
		if(a==b) {
			System.out.println("same memory location");
		}
		else {
			System.out.println("error");
		}
		
	}

}
