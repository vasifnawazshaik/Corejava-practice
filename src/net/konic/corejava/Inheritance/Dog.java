package net.konic.corejava.Inheritance;

public class Dog extends Animal {
	void bark() {
		System.out.println("dog was barking");
	}
    public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();
		obj.bark();
	}
}
