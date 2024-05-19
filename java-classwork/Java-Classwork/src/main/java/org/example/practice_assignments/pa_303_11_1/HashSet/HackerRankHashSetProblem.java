package org.example.practice_assignments.pa_303_11_1.HashSet;

import java.io.*;
import java.util.*;

// https://www.hackerrank.com/challenges/java-hashset/problem
public class HackerRankHashSetProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        // Write your code here
        HashSet<String> names = new HashSet<>();

        for (int i = 0; i < pair_left.length; i++) {
            String val = pair_left[i] + "&" + pair_right[i];
            names.add(val);
            System.out.println(names.size());
        }
    }
}

