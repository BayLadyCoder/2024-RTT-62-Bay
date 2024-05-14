package org.example.practice_assignments.pa_303_4_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        scan.close();

        if(score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if(score < 60) {
            System.out.println("F");
        } else if(score < 70) {
            System.out.println("D");
        } else if(score < 80) {
            System.out.println("C");
        } else if(score < 90) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
