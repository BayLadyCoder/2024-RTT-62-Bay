package org.example.pa_303_7_1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] sArr = {"red", "green", "blue", "yellow"};
        System.out.println("Array length is " + sArr.length);

        String[] newArr = sArr.clone();

        System.out.println(Arrays.toString(newArr));
    }
}
