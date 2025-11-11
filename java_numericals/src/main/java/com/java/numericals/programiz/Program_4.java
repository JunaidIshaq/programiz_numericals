package com.java.numericals.programiz;

public class Program_4 {

    // Java Program to Find ASCII Value of a character

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is " + ascii);
        System.out.println("The ASCII value of " + ch + " is " + castAscii);
        System.out.println(getAsciiValue('A'));
    }

    public static int getAsciiValue(char ch) {
        return (int) ch;
    }

}
