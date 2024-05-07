package org.example;

import java.util.Arrays;

public class ArrayMethodRunner {
    public static void main(String[] args) {
        ArrayDeleteFunction arrayDeleteFunction = new ArrayDeleteFunction();

        int[] arr = {1,2,3,4,5};
        System.out.println("Before" + Arrays.toString(arr));

        arr =  arrayDeleteFunction.delete(arr,2);

        System.out.println("After" + Arrays.toString(arr));

    }
}
