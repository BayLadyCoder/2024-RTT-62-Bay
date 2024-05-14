package org.example.GLABS.GL_303_3_wrapper_class_math_char_string.glab_303_3_1;

public class Compare_1_Example {
    public static void main(String[] args) {
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}
