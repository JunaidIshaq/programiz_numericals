package com.java.numericals.programiz;

public class Program_6 {

    // Java Program to Swap Two Numbers

    public static void main(String[] args) {

        float first = 1.21f;
        float second = 2.45f;
        swapWithTemporary(first, second);
        swapWithOutTemporary(first, second);
    }

    private static void swapWithOutTemporary(float first, float second) {

        System.out.println("--Before Swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second; // 1.21 - 2.45 = -1.24
        second = first + second; // -1.21 + 2.45 = 1.21
        first = second - first; // 1.21 - (-1.24) = 2.45

        System.out.println("--After Swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }


    public static void swapWithTemporary(float first, float second) {

        System.out.println("--Before Swap--");
        System.out.println("First Number : " + first);
        System.out.println("Second Number : " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second

        second = temporary;

        System.out.println("--After Swap--");
        System.out.println("First Number : " + first);
        System.out.println("Second Number : " + second);
    }
}
