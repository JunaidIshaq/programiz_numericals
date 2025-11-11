package com.java.numericals.programiz;

public class Program_9 {

    // Java Program to Find the Largest Among Three Numbers

    public static void main(String[] args) {
        double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if(n1 >= n2 && n1 >= n3){  // (-4.5 >= 3.9 && -4.5 >= 2.5)
            System.out.println(n1 + " is the largest number.");
        }else if(n2 >= n1 && n2 >= n3){ // (3.9 >= -4.5 && 3.9 >= 2.5)
            System.out.println(n2 + " is the largest number.");
        }else { // (2.5 is greater)
            System.out.println(n3 + " is the largest number.");
        }

        // Nested If else Statements
        if(n1 >= n2) {
            if(n1 >= n3) {
                System.out.println(n1 + " is the largest number.");
            }else {
                System.out.println(n3 + " is the largest number.");
            }
        }else {
            if(n2 >= n3) {
                System.out.println(n2 + " is the largest number.");
            } else {
                System.out.println(n3 + " is the largest number.");
            }
        }
    }
}
