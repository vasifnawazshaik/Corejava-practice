package net.konic.corejava.Switch;

public class SwitchMobileRecharge {
	public static void main(String[] args) {

		int option = 2;

		switch (option) {
		case 1:
			System.out.println("Data Pack Selected");
			break;
		case 2:
			System.out.println("SMS Pack Selected");
			break;
		case 3:
			System.out.println("Talktime Pack Selected");
			break;
		default:
			System.out.println("Invalid Option");
		}
	}
}
