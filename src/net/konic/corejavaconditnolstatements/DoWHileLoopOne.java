package net.konic.corejavaconditnolstatements;

import java.util.Scanner;  // Import must be outside the class

public class DoWHileLoopOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("----- MENU -----");
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();  // read user choice

            if (choice == 1) {
                System.out.println("Hello!");
            } 
            else if (choice == 2) {
                System.out.println("Bye!");
            } 
            else if (choice == 3) {
                System.out.println("Exiting...");
            } 
            else {
                System.out.println("Invalid choice!");
            }

            System.out.println(); // blank line for neat output

        } while (choice != 3);   // repeat until Exit

        sc.close();
    }
}
