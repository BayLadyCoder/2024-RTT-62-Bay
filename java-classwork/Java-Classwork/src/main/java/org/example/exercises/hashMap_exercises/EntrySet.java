package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class EntrySet {
    // 9. Write a Java program to create a set view of the mappings contained in a map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.entrySet());
    }
}
