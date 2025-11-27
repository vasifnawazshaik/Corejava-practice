package net.konic.corejava.oprators;

import java.util.Scanner;

public class AssignmentOperator6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = sc.nextInt();
		
		number += 5;
        System.out.println("After number += 5: " + number);
        
        number -=3;
        System.out.println("After number -=3:"+ number);
        
        number *=2;
        System.out.println("After number *=2:"+number);
        
        number/=2;
        System.out.println("After number /2:"+number);
        sc.close();
        
        

		
		
		
		
		
		
		
	}

}
