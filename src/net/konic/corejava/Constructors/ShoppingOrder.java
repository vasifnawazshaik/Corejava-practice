package net.konic.corejava.Constructors;

public class ShoppingOrder {
	static double discount =10;
	int price;
	public ShoppingOrder(int price) {
		this.price = price;
	}
	
	double totalDiscount() {
		return price-(price*discount/100);
	}
	public static void main(String[] args) {
		ShoppingOrder s1 = new ShoppingOrder(10000);
		double totalAmount=s1.totalDiscount();
		System.out.println("final amount : "+ totalAmount);
		
	}
	

}
