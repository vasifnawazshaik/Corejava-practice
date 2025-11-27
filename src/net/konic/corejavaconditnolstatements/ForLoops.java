package net.konic.corejavaconditnolstatements;

public class ForLoops {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 35) {   // First condition → Pass
             if (marks >= 75) {   // Second condition → Distinction
                System.out.println("Pass with Distinction");
            } else {
                System.out.println("Pass");
            }
        } else {
            System.out.println("FAIL");
        }
    }
}
