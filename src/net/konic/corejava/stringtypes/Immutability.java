package net.konic.corejava.stringtypes;

public class Immutability {
  public static void main(String[] args) {
	String password = "admin 123";
	password.concat("567");
	System.out.println(password);
}
}
