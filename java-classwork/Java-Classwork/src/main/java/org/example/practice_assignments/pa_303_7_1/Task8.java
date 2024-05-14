package org.example.practice_assignments.pa_303_7_1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five"};
        System.out.println("Before: " + Arrays.toString(arr));

        // swap
        String temp = arr[0];
        arr[0] = arr[arr.length/2];
        arr[arr.length/2] = temp;

        System.out.println("After: " + Arrays.toString(arr));
    }
}
