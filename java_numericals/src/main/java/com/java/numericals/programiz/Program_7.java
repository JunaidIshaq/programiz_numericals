package com.java.numericals.programiz;

import java.util.Scanner;

public class Program_7 {

    // Java Program to Check Whether a Number is Even or Odd

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = reader.nextInt();

        ifelseStatement(num);
        ternaryStatement(num);
    }

    public static void ifelseStatement(int num){

        if(num % 2 == 0){
            System.out.println(num + " is Even");
        }else {
            System.out.println(num + " is Odd");
        }
    }

    public static void ternaryStatement(int num){
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + evenOdd);
    }
}
