package net.konic.corejava.IsAHasA;

class PaymentDetails{
	static String method;
	static int amount;
	public PaymentDetails(String method, int amount) {
		super();
		this.method = method;
		this.amount = amount;
	}
	
}
class Order{
	 public void displaySummary() {
		 System.out.println("Order placed successfully");
		 System.out.println("Payment Method : "+ PaymentDetails.method);
		 System.out.println("Amount : "+ PaymentDetails.amount);
	 }
}
public class Payment {
   public static void main(String[] args) {
		Order o = new Order();
		o.displaySummary();
	}

}
