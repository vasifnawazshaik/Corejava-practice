package net.konic.corejava.constructors;

public class Car {
	
	static int carCount=0;
	String name;
	public Car(String name) {
		this.name = name;
		carCount++;
	}
	public static void main(String[] args) {
		Car c1 = new Car("BMW");
		Car c2 = new Car("Audi");
		Car c3 = new Car("Kia");
		System.out.println("total sales: "+Car.carCount);
		
		
	}
	
	

}
