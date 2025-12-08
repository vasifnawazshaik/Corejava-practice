package net.konic.corejava.Overloading;

public class AtmWithdrawal {
	void withdrintaw( int amount){
		System.out.println("withdraw:"+ amount);
		
	}
      void withdraw(double amount){
		System.out.println("withdraw:"+ amount);
      }
      void withdraw(int ammount, String accounttype) {
    	  System.out.println("withdraw:"+ ammount);
      }
      public static void main(String[] args) {
		AtmWithdrawal obj = new AtmWithdrawal();
		obj.withdrintaw(500);
		obj.withdraw(500.75);
		obj.withdraw(1000, "From Current account");
	
		
	}
	}
