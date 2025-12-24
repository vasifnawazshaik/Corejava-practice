package net.konic.corejava.stringtypes;

public class UpdateOtp{
	public static void main(String[] args) {
		
		StringBuffer otp=new StringBuffer("12345");
		otp.deleteCharAt(otp.length()-1);
		System.out.println("Updated Otp : "+ otp);
	
	}

}
