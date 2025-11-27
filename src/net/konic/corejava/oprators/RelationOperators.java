package net.konic.corejava.oprators;


import java.util.Scanner;

public class RelationOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enterfristnumber");
		float a = sc.nextFloat();
		System.out.println("Enterscondnumber");
		float b = sc.nextFloat();
		
		System.out.println("a==b:"+ (a==b));
		System.out.println("a>b:"+ (a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		
		
		
	}

}
