package net.konic.corejava.Switch;

public class SwitchAndContinue {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				continue;
			}

			switch (i) {
			case 1:
				System.out.println("1 → ONE");
				break;
			case 3:
				System.out.println("3 → THREE");
				break;
			case 5:
				System.out.println("5 → FIVE");
				break;
			case 7:
			case 9:
				System.out.println(i + " → ODD NUMBER");
				break;
			default:
				System.out.println(i + " → ODD NUMBER");
			}
		}
	}

}
