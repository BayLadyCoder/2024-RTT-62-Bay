package org.example.pa_303_7_1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 13, 1, 0};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length -1];

        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
