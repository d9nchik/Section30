package com.d9nich;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        System.out.print("Enter a hex number: ");
        String str = new Scanner(System.in).next();

        if (str.chars().parallel().map(Character::toLowerCase)
                .allMatch(value -> ('0' <= value && value <= '9') || ('a' <= value && value <= 'f')))
            System.out.println("Decimal representation: " + str.chars().map(Character::toLowerCase).map(e -> {
                if ('0' <= e && e <= '9')
                    return e - '0';
                else
                    return e - 'a' + 10;
            }).reduce(0, (e1, e2) -> e1 * 16 + e2));
        else
            System.out.println("Incorrect number");
    }
}
