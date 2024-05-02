package org.example;

import java.text.DecimalFormat;

public class Homework303_2_1 {
    public static void main(String[] args) {
        {
            // Write a program that declares two integer variables,
            // assigns an integer to each, and adds them together.
            // Assign the sum to a variable. Print out the result.
            int num1 = 10;
            int num2 = 20;
            int sum = num1 + num2;
            System.out.println("Sum is " + sum); // Sum is 30
        }

        {
            // Write a program that declares two double variables,
            // assigns a number to each, and adds them together.
            // Assign the sum to a variable. Print out the result.
            double num1 = 11.41;
            double num2 = 3.55;
            double sum = num1 + num2;
            System.out.println(sum); // 14.96
        }

        {
            // Write a program that declares an integer variable and a double variable,
            // assigns numbers to each, and adds them together.
            // Assign the sum to a variable. Print out the result.
            // What variable type must the sum be?
            int num1 = 10;
            double num2 =22.50;
            double sum = num1 + num2;
            System.out.println("Sum should be type: double" );
            System.out.println(sum); // 32.5
        }

        {
            // Write a program that declares two integer variables,
            // assigns an integer to each, and divides the larger number by the smaller number.
            // Assign the result to a variable. Print out the result.
            // Now change the larger number to a decimal. What happens? What corrections are needed?
            double largeNum = 500;
            int smallNum = 27;
            double result = largeNum/smallNum;
            System.out.println(result); // 18.51851851851852
            System.out.println("When both numbers were int, the result got rounded down to 18.0");
        }

        {
            // Write a program that declares two double variables,
            // assigns a number to each, and divides the larger by the smaller number.
            // Assign the result to a variable. Print out the result.
            // Now, cast the result to an integer.
            // Print out the result again.
            double largeNum = 11.10;
            double smallNum = 8.55;
            double result = largeNum/smallNum;
            System.out.println(result); // 1.2982456140350875
            System.out.println((int)result); // 1
        }

        {
            // Write a program that declares two integer variables, x and y,
            // and assigns the number 5 to x and the number 6 to y.
            // Declare a variable q and assign y/x to it and print q.
            // Now, cast y to a double and assign it to q.
            // Print q again.
            int x = 5;
            int y = 6;
            double q = y/x;
            System.out.println(q); // 1.0

            double q2 = (double)y/x;
            System.out.println(q2); // 1.2
        }

        {
            // Write a program that declares a named constant and uses it in a calculation.
            // Print the result.
            final double PI = 3.14;
            double radius = 5;
            double circumference = 2 * PI * radius;
            System.out.println("Circumference is " + circumference); // 31.400000000000002
        }

        {
            // Write a program where you create three variables that represent products at a cafe.
            // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
            // Assign prices to each product.
            // Create two more variables called subtotal and totalSale
            // and complete an “order” for three items of the first product,
            // four items of the second product, and two items of the third product.
            // Add them all together to calculate the subtotal.
            // Create a constant called SALES_TAX
            // and add sales tax to the subtotal to obtain the totalSale amount.
            // Be sure to format the results to two decimal places.
            double coffeePrice = 5.19;
            double greenTeaPrice = 4.95;
            double hotChocolatePrice = 3.19;

            double subTotal = (coffeePrice * 3) + (greenTeaPrice * 4) + (hotChocolatePrice * 2);

            final double SALES_TAX = 0.06;

            double totalSale = subTotal + (subTotal * SALES_TAX);

            DecimalFormat decimalFormat =  new DecimalFormat("#0.00");

            System.out.println("Before format: " + totalSale); // Before format: 44.25500000000001
            System.out.println("After format: " + decimalFormat.format(totalSale)); // After format: 44.26

        }
    }
}
