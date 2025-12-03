package net.konic.corejava.Variables;
import java.util.Scanner;

public class ProductDiscount {
	
	int price;
	void readPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price: " );
		int p = sc.nextInt();
		price=p;
	}
	
	double discount() {
		return price -(price*0.10);
	}
	
	public static void main(String[] args) {
		ProductDiscount p= new ProductDiscount();
		p.readPrice();
		System.out.println("discount price : "+ p.discount());
		
	}

}
