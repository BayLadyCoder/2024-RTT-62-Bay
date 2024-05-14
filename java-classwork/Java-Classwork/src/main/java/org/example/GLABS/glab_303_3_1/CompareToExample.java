package org.example.GLABS.glab_303_3_1;

public class CompareToExample {
    public static void main(String[] args) {
        {
            String s1 = "hello";
            String s2 = "hello";
            String s3 = "hemlo";
            String s4 = "flag";
            System.out.println(s1.compareTo(s2)); // 0 because both are equal
            System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
            System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        }

        {
            String s1 = "Perscholas";
            String s2 = "Perscholas";
            String s3 = "Perschola";
            String s4 = "PerscholasX";
            System.out.println(s1.compareTo(s2)); //0
            System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
            System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
        }

    }
}
