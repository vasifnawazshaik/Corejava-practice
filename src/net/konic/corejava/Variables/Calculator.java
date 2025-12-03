package net.konic.corejava.Variables;
import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	
	void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter 1st number : ");
			num1 = sc.nextInt();
			
			System.out.println("enter 2nd number : ");
			num2=sc.nextInt();
		}
		
	}
	int add() {
		int result = num1+num2;
		System.out.println(result);
		
		return result;
    }
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
			c1.readInput();
		int add =	c1.add();
		System.out.println(add);
			
		
	}
	

}
