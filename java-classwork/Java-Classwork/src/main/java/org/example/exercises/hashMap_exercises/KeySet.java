package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    // 11. Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.keySet());
    }
}
