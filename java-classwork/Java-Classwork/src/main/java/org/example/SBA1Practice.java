package org.example;

public class SBA1Practice {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // part 1 - create a for loop to print each character of the string s on its own line
        // you can use the s.charAt(pos) function

        /*
          A
          B
          C
          D
          E
          F
          G
          ...
         */

        for(int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // part 2
        // Given the following Strings convert them to integer values   Integer.valueOf()
        String ten = "10";
        String hundred = "100";

        Integer tenInt = Integer.parseInt(ten);
        Integer hundredInt = Integer.valueOf(hundred);
        System.out.println(tenInt);
        System.out.println(hundredInt);

        // part 3
        // given an integer array find the sum of all the integers in the array
        int[] array = {2, 4, 5, 6, 7, 8, 10};
        int sum = 0;
        for(int i=0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);

        // part 4
        // given the array of string covert them to numbers and print the sum
        String[] nums = {"2", "4", "5", "6", "7", "8", "10"};
        int sum2 = 0;

        for(int i=0; i < nums.length; i++) {
            sum2 += Integer.valueOf(nums[i]);
        }

        System.out.println("Sum2: " + sum2);
    }
}
