package org.example.practice_assignments.pa_303_5_1;

public class Task3 {
    public static void main(String[] args) {
        double tuition = 10_000;
        double increaseRate = 0.07;
        int year = 0;
        double doubledTuition = tuition * 2;

        while(tuition < doubledTuition) {
            tuition = tuition + (tuition * increaseRate);
            year++;
        }

        System.out.println("Take " + year + " years");
    }
}
