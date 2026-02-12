package com.java.numericals.programiz;

import java.util.ArrayList;
import java.util.List;

public class Program_12 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        for (String s : list) {
            list.add("C"); // runtime error: ConcurrentModificationException
        }
    }
}
