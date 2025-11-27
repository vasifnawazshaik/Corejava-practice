package net.konic.corejava.oprators;

import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String correctusername = "fazlu";
		String correctpassword = "786";
		
		System.out.println("Entercorrectusername:");
		String username = sc.nextLine();
		
		System.out.println("Entercorrectpassword:");
		String password = sc.nextLine();
		if (username.equals(correctusername) && password.equals(correctpassword)) {
			System.out.println("login sucesses");
		}else {
			System.out.println("login failed");
		}

	}
		
		
		
		
		
	} 
	


