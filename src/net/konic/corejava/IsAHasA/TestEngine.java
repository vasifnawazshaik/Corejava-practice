package net.konic.corejava.IsAHasA;

class CarEngine {
	
	public void startEngine() {
		System.out.println("Engine started");
	}
}

class Car extends CarEngine{
	CarEngine carEngine = new CarEngine();
	public void move() {
		carEngine.startEngine();
		System.out.println("car is moving");
	}
	
}
public class TestEngine{
public static void main(String[] args) {
	Car car = new Car();
	car.move();
}
}

