package net.konic.corejava.Switch;

import java.util.Scanner;  // Scanner must be imported

public class Break5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stock prices separated by spaces (enter -1 to stop):");

        while (true) {
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("Stop reading at -1");
                break;   // Stop the loop when -1 is entered
            }
        }

        sc.close();
    }
}
