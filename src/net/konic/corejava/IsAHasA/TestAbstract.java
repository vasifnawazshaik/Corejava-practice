package net.konic.corejava.IsAHasA;

import java.util.Scanner;

abstract class Shape {
	abstract void draw();	

 }
 class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("drawing circle");
		// TODO Auto-generated method stub
		
	}
	 
 }
 class Square extends Shape{

	@Override
	void draw() {
		System.out.println("drwing square");
	}
		// TODO Auto-generated method stub
		
	}
 public class TestAbstract {
	 private static final String input = null;

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter shape");
		String s = sc.nextLine();
     Shape shape;    // reference of abstract class
	 
	 if (input.equalsIgnoreCase("Circle")) {
    	 shape = new Circle();
    	 
     } else if(input.equalsIgnoreCase("Square")) {
    	 shape = new Square();
     } else {
    	 System.out.println("invalid shape");
    	 return;
     }
	 shape.draw();
	}
	 
 }