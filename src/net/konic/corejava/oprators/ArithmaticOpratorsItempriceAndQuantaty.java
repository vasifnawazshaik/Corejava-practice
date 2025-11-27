package net.konic.corejava.oprators;

import java.util.Scanner;

public class ArithmaticOpratorsItempriceAndQuantaty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enteritemprice");
		double itemprice = sc.nextDouble();
		System.out.println("Enteritemquantity");
		double itemquantity = sc.nextDouble();
		System.out.println("Entertheresturant");
		String theresturant = sc.next();
		System.out.println("\n--- OUTPUT ---");
		System.out.println("Item Price: " + itemprice);
		System.out.println("Quantity: " + itemquantity);
		System.out.println("Restaurant: " + theresturant);


		
		
	}

}
