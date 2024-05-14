package org.example.practice_assignments.pa_303_7_1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[count];

        for(int i = 1; i <= count; i++) {
            System.out.print("Enter your thing: ");
            String thing = scanner.nextLine();
            arr[i - 1] = thing;
        }

        System.out.println("Your favorite things are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
