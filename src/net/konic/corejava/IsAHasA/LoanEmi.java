package net.konic.corejava.IsAHasA;

class BankLoan{
	 void calculateEmi(){
		System.out.println("Calculate Emi");
	}
}
class HomeLoan extends BankLoan {
	public void calculateEmi() {
		System.out.println("Calculate emi for Home Lone");
	}
class CarLoan extends BankLoan{
			
	public void calculateEmi() {
		System.out.println(" Calculate Car Lone");
	}

}
public class LoanEmi {
	HomeLoan h = new HomeLoan();
	CarLoan c = new CarLoan();
}

}
