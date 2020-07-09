package com.d9nich;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Enter numbers: ");

        Scanner input = new Scanner(System.in);

        final ArrayList<Integer> arrayList = new ArrayList<>();
        int number;
        while ((number = input.nextInt()) != 0) {
            arrayList.add(number);
        }

        long evenNumber = arrayList.parallelStream().filter(e -> e % 2 == 0).count();
        System.out.println("The number of even numbers: " + evenNumber);
        System.out.println("The number of odd numbers: " + (arrayList.size() - evenNumber));


        System.out.println(arrayList.parallelStream().sorted().collect(StringBuilder::new,
                (c, e) -> c.append(e).append(", "), StringBuilder::append).toString());
    }
}
