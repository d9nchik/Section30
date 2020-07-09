package com.d9nich;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        System.out.print("Enter a binary number: ");
        String str = new Scanner(System.in).next();
        if (str.chars().parallel().allMatch(value -> value == '0' || value == '1'))
            System.out.println("Decimal representation: " + str.chars().map(e -> e - '0')
                    .reduce(0, (e1, e2) -> e1 * 2 + e2));
        else
            System.out.println("Incorrect number");
    }
}
