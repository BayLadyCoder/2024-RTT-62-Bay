package org.example.pa_303_2_2;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
