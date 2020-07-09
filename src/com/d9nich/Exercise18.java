package com.d9nich;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.print("Enter path to file: ");
        try {
            Files.lines(new File(new Scanner(System.in).next()).toPath()).parallel()
                    .filter(e -> e.length() != 0)
                    .map(e -> Arrays.stream(e.split("[\\W\\d]+"))).reduce(Stream::concat).orElseThrow()
                    .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k + ": " + v));
        } catch (IOException ex) {
            System.out.println("Check is yor path valid!");
        }
    }
}
