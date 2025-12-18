package net.konic.corejava.stringtypes;

public class InvoiceNumber {
	public static void main(String[] args) {
		StringBuffer message = new StringBuffer("Invoice generate");
		String number = new String("101");
		message.insert(7, " 101");
		System.out.println(message );
	}

}
