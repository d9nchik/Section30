package com.d9nich;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.print("Enter path to file: ");
        try {
            Set<String> strings = new TreeSet<>();
            Files.lines(new File(new Scanner(System.in).next()).toPath()).parallel().map(String::toLowerCase).
                    forEach(line -> Collections.addAll(strings, line.split("\\W+")));
            strings.forEach(System.out::println);
        } catch (IOException ex) {
            System.out.println("Check is yor path valid!");
        }
    }
}
