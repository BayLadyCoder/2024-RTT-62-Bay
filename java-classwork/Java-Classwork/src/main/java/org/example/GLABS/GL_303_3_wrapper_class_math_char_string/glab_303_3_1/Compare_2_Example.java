package org.example.GLABS.GL_303_3_wrapper_class_math_char_string.glab_303_3_1;

public class Compare_2_Example {
    public static void main(String[] args) {
        String s1="Perscholas";
        String s2="Perscholas";
        String s3=new String("Perscholas");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }
}
