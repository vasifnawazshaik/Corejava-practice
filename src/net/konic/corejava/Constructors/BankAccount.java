package net.konic.corejava.Constructors;

public class BankAccount {
	int accountNo;
	static String BankName=" SBI";
    String name;
    double deposit;
       
    public BankAccount(int accountNo,String name) {
    	 this.accountNo = accountNo;
    	 this.name = name;
    }
    public double balance(double deposite) {
    	    return deposite;
    }
    public static void main(String[] args) {
    	   BankAccount ba = new BankAccount(1316,"samanta");
    	  System.out.println("bank:"+ BankName);
    	  System.out.println("accountNo:"+ ba.accountNo);
    	  System.out.println("name:"+ ba.name);
    	  System.out.println("balance:"+ ba.balance(6500));
    	 
    	    
    }
    
}
