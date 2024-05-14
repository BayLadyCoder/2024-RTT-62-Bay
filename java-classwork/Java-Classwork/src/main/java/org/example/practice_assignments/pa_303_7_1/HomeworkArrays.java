package org.example.practice_assignments.pa_303_7_1;

public class HomeworkArrays {
    public static void main(String[] args) {
        int[] arr = {123, 56, 3, 6, 14, 4, 77, 897, 234, 8};
        int min = arr[0];
        int max = arr[0];
        double sum = arr[0];

        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }

        double average = sum/arr.length;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}
