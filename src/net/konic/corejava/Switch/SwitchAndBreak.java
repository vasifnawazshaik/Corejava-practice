package net.konic.corejava.Switch;

import java.util.Scanner;

public class SwitchAndBreak {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;

		while (true) {
			// Display ATM menu
			System.out.println("\n--- ATM Menu ---");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");
			System.out.print("Enter your option: ");

			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Your balance is $5000");
				break;
			case 2:
				System.out.println("Deposit selected");
				break;
			case 3:
				System.out.println("Withdraw selected");
				break;
			case 4:
				System.out.println("Exit… Thank You!");
				break; // Breaks switch, loop will also exit below
			default:
				System.out.println("Invalid option. Try again!");
			}

			if (option == 4) {
				break; // Exit the loop
			}
		}

		sc.close();
	}
}
