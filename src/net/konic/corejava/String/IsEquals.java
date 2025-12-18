package net.konic.corejava.String;

public class IsEquals {
	public static void main(String[] args) {
		String v1 = "wasif";
		String v2 = "wasif";
		String v3 = new String("jsava");
		//check reference memory
		System.out.println("v1 == v3:"+ (v1 == v3)); 
		System.out.println("v1 == v2:" + (v1 == v2) );
		System.out.println("v1.equals(v3):" + v1.equals(v3));
	}

}
