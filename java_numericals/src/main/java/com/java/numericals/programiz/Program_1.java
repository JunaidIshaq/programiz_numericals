package com.java.numericals.programiz;


import java.util.Scanner;

public class Program_1 {

    // Java Program to Print an Integer (Entered by the User)

    public static void main(String[] args) {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen
        System.out.println("You entered : " + number);
    }

}