package net.konic.corejava.ClassObject;

public class Laptop {
	String name;
	String colour;
	int price;
	
	public void display(String name,String colour,int price) {
		System.out.println(name);
		System.out.println(colour);
		System.out.println(price);
		
	}
	
	public static void main(String[] args) {
		
		Laptop l= new Laptop();
		l.display("vasif", "red", 100000);		
	}

}
