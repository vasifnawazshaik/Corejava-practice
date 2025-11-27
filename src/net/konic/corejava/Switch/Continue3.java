package net.konic.corejava.Switch;

public class Continue3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				continue; // Skip the number 5
			}

			System.out.print(i + " ");
		}
	}

}
