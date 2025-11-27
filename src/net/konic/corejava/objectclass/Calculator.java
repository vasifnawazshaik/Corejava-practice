package net.konic.corejava.objectclass;

public class Calculator {

	public int add(int x, int y) {
		int z = x + y;
		System.out.println(z);
		return z;
	}

	public int sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
		return c;

	}

	public double mul(double a, double b) {
		double c = a * b;
		System.out.println(c);
		return c;
	}

	public double div(double x, double y) {
		double z = x / y;
		System.out.println(z);
		return z;

	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		calculator.add(3, 4);
		calculator.sub(3, 2);
		calculator.div(22, 10);
		calculator.add(10, 10);

	}

}
