package org.example.exercises.hashMap_exercises;

import java.util.HashMap;
import java.util.Map;

public class Values {
    // 12. Write a Java program to get a collection view of the values contained in this map.
    public static void main(String[] args) {
        Map<String, Object> hMap = new HashMap<>();

        hMap.put("name", "Katniss");
        hMap.put("age", 8);

        System.out.println(hMap.values());
    }
}
