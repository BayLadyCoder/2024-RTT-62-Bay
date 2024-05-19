package org.example.practice_assignments.pa_303_11_1.Sort;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class HackerRankSortProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
        }
        in.close();

        Collections.sort(studentList, (a, b) -> {
            if (Double.compare(b.getCgpa(), a.getCgpa()) != 0) {
                return Double.compare(b.getCgpa(), a.getCgpa());
            } else {
                return a.getFname().compareTo(b.getFname());
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
