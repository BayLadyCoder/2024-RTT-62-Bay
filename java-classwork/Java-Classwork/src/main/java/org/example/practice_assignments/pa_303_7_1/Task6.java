package org.example.practice_assignments.pa_303_7_1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {34, 22, 1, 4, 6};
        System.out.println("Before: " + Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }

        System.out.println("After: " + Arrays.toString(arr));
    }
}
