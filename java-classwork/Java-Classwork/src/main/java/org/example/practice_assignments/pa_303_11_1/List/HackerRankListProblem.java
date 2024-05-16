package org.example.practice_assignments.pa_303_11_1.List;

import java.util.*;

// https://www.hackerrank.com/challenges/java-list/problem
public class HackerRankListProblem {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        List<Integer> nums = new ArrayList<Integer>(length);

        for(int i=0; i < length; i++){
            Integer num = scanner.nextInt();
            nums.add(num);
        }

        int queries = scanner.nextInt();

        for(int i=0; i < queries; i++){
            scanner.nextLine();
            String command = scanner.nextLine();
            if(command.equals("Insert")) {
                int indexToInsertAt = scanner.nextInt();
                Integer num = scanner.nextInt();

                if(indexToInsertAt < nums.size()){
                    nums.add(indexToInsertAt, num);
                } else {
                    nums.add(num);
                }

            } else if(command.equals("Delete")){
                int indexToRemove = scanner.nextInt();
                nums.remove(indexToRemove);

            }
        }

        for(Integer num: nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
