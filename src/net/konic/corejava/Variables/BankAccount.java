package net.konic.corejava.Variables;

public class BankAccount {
	int balance=0;
	
	void deposit(int amount) {

		balance = balance + amount;
	}
	int getBalance() {
		return balance;
		
	}
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		b.deposit(5000);
		System.out.println(b.getBalance());
	}
	

}
