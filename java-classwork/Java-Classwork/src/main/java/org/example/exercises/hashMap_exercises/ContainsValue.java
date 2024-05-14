package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class ContainsValue {
    // 8. Write a Java program to test if a map contains a mapping for the specified value.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.containsValue("Katniss"));
        System.out.println(hMap.containsValue(8));
        System.out.println(hMap.containsValue(15));
    }
}
