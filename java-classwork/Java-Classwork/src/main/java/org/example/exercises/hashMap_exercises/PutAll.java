package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class PutAll {
    // 3. Write a Java program to copy all mappings from the specified map to another map.
    public static void main(String[] args) {
        Map<String, Object> hMap1 = new HashMap<>();

        hMap1.put("name", "Katniss");
        hMap1.put("age", 8);

        Map<String, Object> hMap2 = new HashMap<>();

        hMap2.putAll(hMap1);

        System.out.println("\nEntries 1: ");
        for (Map.Entry<String, Object> entry : hMap1.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("\nEntries 2: ");
        for (Map.Entry<String, Object> entry : hMap2.entrySet()) {
            System.out.println(entry);
        }
    }
}
