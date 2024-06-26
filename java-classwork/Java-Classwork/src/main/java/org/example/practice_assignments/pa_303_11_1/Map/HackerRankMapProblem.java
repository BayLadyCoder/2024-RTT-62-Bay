package org.example.practice_assignments.pa_303_11_1.Map;

import java.util.*;
import java.io.*;

// https://www.hackerrank.com/challenges/phone-book/problem
public class HackerRankMapProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();
            Integer val = phoneBook.get(s);

            if(val != null){
                System.out.println(s + "=" + val);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
