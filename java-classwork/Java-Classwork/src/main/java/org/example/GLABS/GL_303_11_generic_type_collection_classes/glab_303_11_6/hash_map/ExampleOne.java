package org.example.GLABS.GL_303_11_generic_type_collection_classes.glab_303_11_6.hash_map;

import java.util.HashMap;

public class ExampleOne {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        languages.put(4, "C Sharp");

        System.out.println("HashMap: " + languages);
        // remove element associated with key 2
        String value = languages.remove(2);
        System.out.println("Removed value: " + value);
        System.out.println("Updated HashMap: " + languages);
    }
}
