package net.konic.corejava.Inheritance;

public class Car extends Vehicle{
	void speed() {
		System.out.println("speed: 120");
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.brand();
		obj.speed();

	}
      
}
