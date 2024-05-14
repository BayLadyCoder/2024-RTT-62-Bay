package org.example.practice_assignments.pa_303_7_1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5,6,8,3,8};
        System.out.println("Before: " + Arrays.toString(arr));

        for(int i=0; i < arr.length; i++) {
            arr[i] = i;
        }

        System.out.println("After: " + Arrays.toString(arr));
    }
}
