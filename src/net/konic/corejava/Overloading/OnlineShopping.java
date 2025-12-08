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

	void addtocart(int x) {
		System.out.println("addtocart:"+ x);
	}
	void addtocart(int x,int y) {
		System.out.println("product "+ x +"added with quantity " +y);
	}
	void addtocart(String z) {
		System.out.println(z + " added to cart ");
	}
     public static void main(String[] args) {
		OnlineShopping obj = new OnlineShopping();
		obj.addtocart(101);
		obj.addtocart(101, 3);
		obj.addtocart("Earphones");
	}  
     
}
