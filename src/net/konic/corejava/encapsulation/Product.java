package net.konic.corejava.encapsulation;

public class Product { /*Create a Product class with private price.
Price cannot be negative.

Input:

Enter Price: -500

Output:

Invalid price */
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price >= 0) {
		this.price = price;
	}
		else {
			System.out.println("Invalid Price");
		}
	}
	public static void main(String[] args) {
		Product obj = new Product();
		obj.setPrice(-500);
	int product =	obj.getPrice();
	System.out.println("Product" + product);
	}
}
