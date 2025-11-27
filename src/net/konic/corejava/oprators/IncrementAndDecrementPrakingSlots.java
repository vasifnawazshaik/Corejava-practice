package net.konic.corejava.oprators;

import java.util.Scanner;

public class IncrementAndDecrementPrakingSlots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int slots = 25;

		slots--;
		slots--;

		slots++;

		System.out.println("Available parking slots:" + slots);

	}

}
