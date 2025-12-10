package net.konic.corejava.Inheritance;

public class C extends B{
	void cat () {
		System.out.println("C method");
		
	}
	public static void main(String[] args) {
		C c = new C();
		c.animal();
		c.dog();
		c.cat();
	}

}
