package org.example.pa_303_5_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second positive integer: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int maxPossibleGCD = Math.min(num1, num2);
        int gcd = 1;

        for(int i = 2; i <= maxPossibleGCD; i++) {
            if(num1 % i == 0 && num2 % i == 0 && i > gcd) {
                gcd = i;
            }
        }

        System.out.println("Greatest common divisor is " + gcd);
    }
}
