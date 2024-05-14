package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class IsEmpty {
    // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void main(String[] args) {
        Map<String, Object> hMap1 = new HashMap<>();

        hMap1.put("name", "Katniss");
        hMap1.put("age", 8);

        System.out.println("Is hMap1 empty? " + hMap1.isEmpty());

        Map<String, Object> hMap2 = new HashMap<>();
        System.out.println("Is hMap2 empty? " + hMap2.isEmpty());
    }
}
