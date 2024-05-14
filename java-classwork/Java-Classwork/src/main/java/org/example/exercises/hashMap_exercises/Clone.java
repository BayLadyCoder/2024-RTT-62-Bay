package org.example.exercises.hashMap_exercises;

import java.util.*;

public class Clone {
    // 6. Write a Java program to get a shallow copy of a HashMap instance.
    public static void main(String[] args) {
        HashMap<String, String> hMap1 = new HashMap<String, String>();

        hMap1.put("name", "Katniss");
        hMap1.put("age", "8");

//        Map<String, String> hMap2 = new HashMap<>(hMap1);
//        Map<String, String> hMap2 = hMap1.clone();

        HashMap<String, String> hMap2 = (HashMap) hMap1.clone();

        System.out.println("\nEntries 1: ");
        for (Map.Entry<String, String> entry : hMap1.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\nEntries 2: ");
        for (Map.Entry<String, String> entry : hMap2.entrySet()) {
            System.out.println(entry);
        }
    }
}
