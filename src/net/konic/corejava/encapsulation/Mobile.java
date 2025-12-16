package net.konic.corejava.encapsulation;

public class Mobile { /*Create a Mobile class with private pin.
PIN must be exactly 4 digits.

Input:

Enter PIN: 123

Output:

Invalid PIN*/
     private int pin;

	
	 public int getPin() {
		return pin;
	}


	 public void setPin(int pin) {
		 if(pin >999 && pin < 10000) {
			 this.pin = pin;
		 }
			 else {
				 System.out.println("Invalid Pin");
			 }

	
	 }


	 public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.setPin(126);
		int pin = obj.getPin();
		System.out.println("pin" + pin);
	}



}
