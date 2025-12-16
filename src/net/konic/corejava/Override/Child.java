package net.konic.corejava.Override;

public class Child extends Parent {
	void person () {
		System.out.println("iam person from child class");
		
	}
    public static void main(String[] args) {
		Child obj = new Child();
		obj.person();
	}
}
