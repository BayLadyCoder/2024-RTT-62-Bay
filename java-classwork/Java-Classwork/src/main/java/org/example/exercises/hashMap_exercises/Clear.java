package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class Clear {
    // 4. Write a Java program to remove all mappings from a map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println("Before: " + hMap.size());

        hMap.clear();

        System.out.println("After: " + hMap.size());

    }
}
