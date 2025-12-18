package net.konic.corejava.String;

public class BasicString {
	public static void main(String[] args) {
		String name = "konic";
		   
		   System.out.println("companyname:" + name);
		   System.out.println("length:" + name.length());
		   System.out.println("uppercase:" + name.toUpperCase());
		   System.out.println("lowercase:" + name.toLowerCase());
		   System.out.println("char at index 9:" + name.charAt(9));
		   System.out.println("contains z:" + name.contains("z"));
	}

}
