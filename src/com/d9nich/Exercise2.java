package com.d9nich;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 50: ");

        Scanner input = new Scanner(System.in);

        final ArrayList<Integer> arrayList = new ArrayList<>();
        int number;
        while ((number = input.nextInt()) != 0) {
            arrayList.add(number);
        }

        arrayList.parallelStream().collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " occurs " + value + " times"));
    }
}
