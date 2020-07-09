package com.d9nich;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise12 {
    public static int sumDigits(long n) {
        return Long.toString(n).chars().map(e -> e - '0').sum();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        long number = input.nextLong();
        System.out.println("Sum digits of number " + number + ": " + sumDigits(number));
    }
}
