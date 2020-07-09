package com.d9nich;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise8 {
    public static int[] eliminateDuplicatesAndSort(int[] list) {
        return IntStream.of(list).parallel().distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("The distinct numbers are: " + Arrays.toString(eliminateDuplicatesAndSort(array)));
    }
}
