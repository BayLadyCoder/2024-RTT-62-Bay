package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class Size {
    // 2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println("Map size is: " + hMap.size());
    }
}
