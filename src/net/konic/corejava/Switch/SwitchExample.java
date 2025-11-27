package net.konic.corejava.Switch;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("select option");

		int s = sc.nextInt();

		switch (s) {

		case 1:
			System.out.println("enter your name  ");
			break;
		case 2:
			System.out.println("enter your account");
			break;
		case 3:
			System.out.println("enter mobile number");
			break;
		default:
			System.out.println("default value");

		}

	}

}
