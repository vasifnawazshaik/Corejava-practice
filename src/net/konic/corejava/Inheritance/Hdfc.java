package net.konic.corejava.Inheritance;

public class Hdfc extends Bank{
	void amount() {
		System.out.println("Bank balance in Hdfc account");
	}
	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		obj.amount();
		
	}

}
