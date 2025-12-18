package net.konic.corejava.stringtypes;

public class UpdateOtp {
public static void main(String[] args) {
	StringBuffer otp = new StringBuffer("12345");
	otp.deleteCharAt(4);
	System.out.println("update otp: " + otp);
}
}
