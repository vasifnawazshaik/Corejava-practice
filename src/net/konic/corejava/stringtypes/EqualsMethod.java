package net.konic.corejava.stringtypes;

public class EqualsMethod {
	public static void main(String[] args) {
		String username = "admin";
		String username1 = new String("admin");
		System.out.println(username == (username1));
		System.out.println(username.equals(username1));
	}

}
