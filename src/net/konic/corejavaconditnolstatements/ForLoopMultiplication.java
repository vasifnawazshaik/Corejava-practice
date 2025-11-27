package net.konic.corejavaconditnolstatements;

import java.util.Scanner;

public class ForLoopMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		System.out.println("Multiplication table of: " + num);

		for (int i = 1; i <= 5; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		sc.close();
	}
}
