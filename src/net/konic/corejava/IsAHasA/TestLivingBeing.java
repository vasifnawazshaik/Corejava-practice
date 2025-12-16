package net.konic.corejava.IsAHasA;

 class LivingBeing {
	void breath() {
		System.out.println("breathing");
	}

}
class Animal extends LivingBeing{
	void sound() {
		System.out.println("Every animal makes a soud");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}
public class TestLivingBeing{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breath();
		dog.sound();
	}
}
