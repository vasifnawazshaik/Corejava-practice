package net.konic.corejava.encapsulation;

public class Account { /*Create an Account class with private accountNumber.
Provide only getter (no setter).

Output:

Account Number: 123456 */

    private double accountnumber = 123456;

	public double getAccountnumber() {
		return accountnumber;
		
	}
public static void main(String[] args) {
	Account ac = new  Account();
	double Account =ac.getAccountnumber();
	System.out.println(Account);
	
} 
	
	}
    



