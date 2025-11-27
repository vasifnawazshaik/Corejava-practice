package net.konic.corejava.oprators;

import java.util.Scanner;

public class ArithmeticOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enterfristnumber");
		int a = sc.nextInt();

		System.out.println("Entersceondnumber");
		int b = sc.nextInt();

		System.out.println("a+b :" + (a + b));
		System.out.println("a - b :" + (a - b));
		System.out.println("a*b:" + (a * b));
		System.out.println("a/b:" + (a / b));

	}

}
