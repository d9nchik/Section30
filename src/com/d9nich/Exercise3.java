package com.d9nich;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.print("Enter the integers. To stop enter negative number: ");

        Scanner input = new Scanner(System.in);

        final ArrayList<Integer> arrayList = new ArrayList<>();
        int number;
        while ((number = input.nextInt()) >= 0) {
            arrayList.add(number);
        }

        double average = arrayList.parallelStream().mapToInt(e -> e).average().orElse(0);
        System.out.println("Average: " + average);
        long belowAverage = arrayList.parallelStream().filter(e -> e < average).count();

        System.out.println("Below average: " + belowAverage + " numbers");
        System.out.println("Above or equal average: " + (arrayList.size() - belowAverage) + " numbers");

    }
}
