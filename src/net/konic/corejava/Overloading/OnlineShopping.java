package net.konic.corejava.Overloading;

public class OnlineShopping {
	/*Create an overloaded addToCart() method for item ID, item ID & quantity, and item name.

	INPUT:
	addToCart(101)
	addToCart(101, 3)
	addToCart("Earphones")

	OUTPUT:
	Product 101 added to cart
	Product 101 added with quantity 3
	Earphones added to cart
*/

	void addtocart(int item) {
		System.out.println("addtocart "+ item);
	}
	void addtocart(int item,int pant) {
		System.out.println("product "+ item +" added with quantity " +pant);
	}
	void addtocart(String shirt) {
		System.out.println(shirt + " added to cart ");
	}
     public static void main(String[] args) {
		OnlineShopping obj = new OnlineShopping();
		obj.addtocart(101);
		obj.addtocart(101, 3);
		obj.addtocart("Earphones");
	}  
     
}
