package org.example.GLABS.GL_303_11_generic_type_collection_classes.glab_303_11_4;
import java.util.*;

public class LinkedListSortExample {
    public static void main(String[] args)
    {
        // Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted
        System.out.println(linkedList);

        // 1. Sort the list
        Collections.sort(linkedList);

        // Sorted
        System.out.println(linkedList);

        // 2. Custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());

        // Custom sorted
        System.out.println(linkedList);
    }
}
