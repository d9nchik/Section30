package com.d9nich;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise1 {
    private static int counter = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int best = IntStream.of(numbers).parallel().reduce(Integer.MIN_VALUE, Math::max);

        IntStream.of(numbers).forEach(note -> {
            System.out.print("Student " + (counter++) + " score is " + note + " and grade is ");
            if (note >= best - 20)
                System.out.println((char) ((best - note - 1) / 5 + 'A'));
            else
                System.out.println("F");
        });
    }
}
