package org.example.glab_303_3_2;

import java.util.Scanner;  // Import the Scanner class

public class ReadingStringFromConsole2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}
