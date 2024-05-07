package org.example;

public class ArrayDeleteFunction {
    public static int[] delete(int[] source, int deletePosition) {
        if (deletePosition < 0 || deletePosition >= source.length) {
            System.out.println("Position to delete is invalid");
        }

        // 1) create a new array with size - 1
        int[] result = new int[source.length - 1];

        // 2) copy the first elements upto but not including the deleted position
        for (int pos = 0; pos < deletePosition; pos++) {
            result[pos] = source[pos];
        }

        // 3) copy the last elements into a pos-1 in the new array
        for (int pos = deletePosition + 1; pos < source.length; pos++) {
            result[pos - 1] = source[pos];
        }

        for (int value : result) {
            System.out.println(value);
        }

        return result;
    }
}
