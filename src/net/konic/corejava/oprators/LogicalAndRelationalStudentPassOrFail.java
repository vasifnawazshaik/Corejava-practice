package net.konic.corejava.oprators;

import java.util.Scanner;

public class LogicalAndRelationalStudentPassOrFail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks (0-100): ");
		int marks = sc.nextInt();

		boolean isPass = (marks >= 35) && (marks <= 100);

		if (isPass) {
			System.out.println("Result: PASS");
		} else {
			System.out.println("Result: FAIL");
		}

		sc.close();
	}
}
