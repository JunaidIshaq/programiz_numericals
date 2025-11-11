package com.java.numericals.programiz;

public class Program_8 {

    // Java Program to Check Whether an Alphabet is Vowel or Consonant

    public static void main(String[] args) {
        char ch1 = 'i';
        char ch2 = 'z';
        ifelseStatement(ch1);
        switchCaseStatement(ch2);
    }

    private static void ifelseStatement(char ch) {

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is vowel");
        }else {
            System.out.println(ch + " is not vowel");
        }
    }

    private static void switchCaseStatement(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
