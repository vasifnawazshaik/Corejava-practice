package net.konic.corejava.Switch;

public class Continue2 {
	public static void main(String[] args) {

		int[] numbers = { 10, -5, 8, -2, 7 };

		System.out.println("Positive numbers:");

		for (int num : numbers) {
			if (num < 0) {
				continue; // Skip negative numbers
			}

			System.out.println(num);
		}
	}

}
