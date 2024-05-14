package org.example.GLABS.GL_303_2_java_fundamentals.glab_303_2_1;

public class UnaryOperator {
    public static void main(String[] args) {
        int sum = +1;
        // sum is now 1
        System.out.println(sum);

        sum--;
        // sum is now 0
        System.out.println(sum);

        sum++;
        // sum is now 1
        System.out.println(sum);

        sum = -sum;
        // sum is now -1
        System.out.println(sum);

        boolean result = false;
        // false
        System.out.println(result);
        // true
        System.out.println(!result);

    }
}
