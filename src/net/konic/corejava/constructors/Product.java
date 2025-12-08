package net.konic.corejava.constructors;

public class Product {
	String name;
	int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Product() {
		name="unknown";
		price=0;
		
	}
	public static void main(String[] args) {
		Product p =new Product("Nokia",5000);
		System.out.println("product1 "+" "+"name:"+p.name+" "+"price"+p.price);
		Product p2=new Product();
		System.out.println("product2"+ " "+"name : "+ p2.name+ " "+"price: "+ p2.price);
	}
	
	
	
	
	
	

}
