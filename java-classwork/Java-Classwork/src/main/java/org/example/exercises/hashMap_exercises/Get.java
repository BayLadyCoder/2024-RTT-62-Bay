package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class Get {
    // 10. Write a Java program to get the value of a specified key in a map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.get("age"));
    }
}
