package org.example.pa_303_7_1;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        int midIndex = arr.length/2;

        for(int i=0; i < arr.length; i++) {
            if(i != midIndex) {
                System.out.println(arr[i]);
            }
        }
    }
}
