package net.konic.corejava.Switch;

public class Continue1 {
	public static void main(String[] args) {

		String[] emails = { "a@gmail.com", "abc", "test@yahoo.com" };

		System.out.println("Valid emails:");

		for (String email : emails) {
			// Simple validation: check if email contains '@' and '.'
			if (!email.contains("@") || !email.contains(".")) {
				continue; // Skip invalid email
			}

			System.out.println(email);
		}
	}

}
