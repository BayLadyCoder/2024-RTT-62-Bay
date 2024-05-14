package org.example.exercises.hashMap_exercises;

import java.util.*;

// https://www.w3resource.com/java-exercises/collection/hash-map.php

public class Put {
    // 1. Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        // iterate through keys only
        System.out.println("Keys: ");
        for (String key : hMap.keySet()) {
            System.out.println(key);
        }

        // iterate through values only
        System.out.println("\nValues: ");
        for (Object value : hMap.values()) {
            System.out.println(value);
        }

        // iterate through key/value entries
        System.out.println("\nEntries: ");
        for (Map.Entry<String, Object> entry : hMap.entrySet()) {
            System.out.println(entry);
        }
    }
}

