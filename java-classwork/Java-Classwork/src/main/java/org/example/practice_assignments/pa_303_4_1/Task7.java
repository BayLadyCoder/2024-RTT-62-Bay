package org.example.practice_assignments.pa_303_4_1;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your tax filing status? ");
        System.out.println("1: Single");
        System.out.println("2: Married filing jointly or qualifying widow(er)");
        System.out.println("3: Married filing separately");
        System.out.println("4: Head of house hold");
        System.out.print("Choose a number (1-4) to answer: ");
        int status = scanner.nextInt();

        System.out.print("What is your income? ");
        double income = scanner.nextDouble();

        scanner.close();

        double taxRate = 0;

        if(status == 1 ){
            System.out.println("Filing Status: Single");
            if(income <= 8_350){
                taxRate = 0.10;
            } else if (income <= 33_950) {
                taxRate = 0.15;
            } else if (income <= 82_250) {
                taxRate = 0.25;
            } else if (income <= 171_550) {
                taxRate = 0.28;
            } else if (income <= 372_950) {
                taxRate = 0.33;
            } else {
                taxRate = 0.35;
            }
        } else if (status == 2) {
            System.out.println("Filing Status: Married filing jointly or widow(er)");
            if(income <= 16_700){
                taxRate = 0.10;
            } else if (income <= 67_900) {
                taxRate = 0.15;
            } else if (income <= 137_050) {
                taxRate = 0.25;
            } else if (income <= 208_850) {
                taxRate = 0.28;
            } else if (income <= 372_950) {
                taxRate = 0.33;
            } else {
                taxRate = 0.35;
            }
        } else if (status == 3){
            System.out.println("Filing Status: Married filing separately");
            if(income <= 8_350){
                taxRate = 0.10;
            } else if (income <= 33_950) {
                taxRate = 0.15;
            } else if (income <= 68_525) {
                taxRate = 0.25;
            } else if (income <= 104_425) {
                taxRate = 0.28;
            } else if (income <= 186_475) {
                taxRate = 0.33;
            } else {
                taxRate = 0.35;
            }
        } else if(status == 4) {
            System.out.println("Filing Status: Head of household");
            if(income <= 11_950){
                taxRate = 0.10;
            } else if (income <= 45_500) {
                taxRate = 0.15;
            } else if (income <= 117_450) {
                taxRate = 0.25;
            } else if (income <= 190_200) {
                taxRate = 0.28;
            } else if (income <= 372_950) {
                taxRate = 0.33;
            } else {
                taxRate = 0.35;
            }
        }

        if(taxRate == 0) {
            System.out.println("Could not find tax rate");
        } else {
            DecimalFormat df = new DecimalFormat( "#,###.00" );
            double tax = income * taxRate;
            System.out.println("Total income: $" + df.format(income));
            System.out.println("Total tax: $" + df.format(tax));
        }
    }
}
