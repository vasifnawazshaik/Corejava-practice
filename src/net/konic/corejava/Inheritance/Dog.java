package net.konic.corejava.Inheritance;

public class Dog extends Animal {
	void bark() {
		System.out.println("dog was barking");
	}
    public static void main(String[] args) {
		Dog obj = new Dog(); // using this reference variable we can call both parent class and child class//
		obj.eat();
		obj.bark();
	}
}
