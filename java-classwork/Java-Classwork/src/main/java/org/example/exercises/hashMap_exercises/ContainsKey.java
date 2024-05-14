package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class ContainsKey {
    // 7. Write a Java program to test if a map contains a mapping for the specified key.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.containsKey("name"));
        System.out.println(hMap.containsKey("age"));
        System.out.println(hMap.containsKey("gender"));
    }
}
