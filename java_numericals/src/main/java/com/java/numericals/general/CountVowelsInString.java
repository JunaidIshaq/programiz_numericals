package com.java.numericals.general;

public class CountVowelsInString {


    public static void main(String[] args) {
        String input = "Hello World";
        int count = countVowels(input.toLowerCase(), 0);
        System.out.println("Number of vowels : " + count);
    }

    private static int countVowels(String string, int index) {
        // Base case : If index reaches end of string
        if (index == string.length()) {
            return 0;
        }

        char ch = string.charAt(index);
        System.out.println("character: " + ch);

        // Check if current character is vowel
        if (isVowel(ch)) {
            int i = countVowels(string, index + 1);
            System.out.println("i : " + i);
            return i + 1;
        } else {
            int i = countVowels(string, index + 1);
            System.out.println("i : " + i);
            return i;

        }
    }

    // Helper method to check vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u';
    }


}