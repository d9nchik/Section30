package com.d9nich;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        String string = input.nextLine();

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("Character " + ch + " appears " + string.chars().parallel()
                .filter(e -> e == ch).count() + " times.");
    }
}
