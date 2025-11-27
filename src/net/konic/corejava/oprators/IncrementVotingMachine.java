package net.konic.corejava.oprators;

import java.util.Scanner;

public class IncrementVotingMachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int votes = 0;

		votes++;
		votes++;
		votes++;
		votes++;
		votes++;

		System.out.println("Final vote counts:" + votes);

	}

}
