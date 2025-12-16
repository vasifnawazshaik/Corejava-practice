package net.konic.corejava.encapsulation;

public class ATM {  /*Create an ATM class with private balance.
Allow withdraw only if amount ≤ balance.

Input:

Balance: 5000
Withdraw: 6000

Output:

Insufficient balance  */
       private int balance;

	   public int getBalance() {
		   return balance;
	   }

	   public void setBalance(int balance) {
		   this.balance = balance;
	   }
       
       public void withdraw(int amount) {
    	   if(amount <= balance) {
    		   balance = balance - amount;
    		   System.out.println("withdrawal successful");
    		   System.out.println("withdraw balance amount");
    	   }
    	   else {
    		   System.out.println("Insufficient balance");
    	   }
       }
       public static void main(String[] args) {
		ATM atm = new ATM();
		atm.setBalance(5000);
		atm.withdraw(6000);
		
	}


}
