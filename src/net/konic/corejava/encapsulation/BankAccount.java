package net.konic.corejava.encapsulation;

import java.security.DomainCombiner;

public class BankAccount {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		
		if (balance >=0) {
			this.balance = balance;
		}
		else {
			System.out.println("invalid bank");
		}
		
	}
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.setBalance(5000);
		int balance = obj.getBalance();
		System.out.println("balance:" + balance);
	}
   }


