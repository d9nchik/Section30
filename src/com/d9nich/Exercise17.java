package com.d9nich;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise17 {
    private static int vowelCounter = 0;
    private static int consonantCounter = 0;

    public static void main(String[] args) {
        System.out.print("Enter path to file: ");
        try {
            HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            Files.lines(new File(new Scanner(System.in).next()).toPath()).parallel().
                    map(String::chars).reduce(IntStream::concat).orElseThrow().parallel().mapToObj(e -> (char) e)
                    .map(Character::toLowerCase).filter(Character::isAlphabetic).forEach(e -> {
                if (vowels.contains(e))
                    vowelCounter++;
                else
                    consonantCounter++;
            });

            System.out.println("Total consonant: " + consonantCounter);
            System.out.println("Total vowel: " + vowelCounter);
        } catch (IOException ex) {
            System.out.println("Check is yor path valid!");
        }

    }
}
