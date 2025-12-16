package net.konic.corejava.IsAHasA;

 class Vehicle {
        void start() {
        System.out.println("iam from vehical");
        
        }
}
class Car extends Vehicle{
	   void start() {
		   System.out.println(" car starts with key");
		   
	   }

	   public void Start() {
		// TODO Auto-generated method stub
		
	   }

	   public void Start() {
		// TODO Auto-generated method stub
		
	   }
   
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike starts with kick");
		
	}
	
}
public class TestVehicle{
    public static void main(String[] args) {
	Car car = new Car();
	Bike bike = new Bike();
	( car).start();
	bike.start();
    }
}