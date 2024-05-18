package org.example.GLABS.GL_303_11_generic_type_collection_classes.glab_303_11_6.tree_map;

import java.util.TreeMap;

public class ExampleThree {
    public static void main(String[] args) {
        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }
}
