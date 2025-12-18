package net.konic.corejava.stringtypes;

public class MaskMobileNum {
	public static void main(String[] args) {
		StringBuffer Mobile = new StringBuffer("9123912390");
		Mobile.replace(2,7,"******");
		System.out.println("Masked mobile: " + Mobile);
		
	}

}
