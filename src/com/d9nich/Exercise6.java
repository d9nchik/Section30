package com.d9nich;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Exercise6 {
    public static int average(int[] array) {
        return (int) IntStream.of(array).parallel().average().orElse(0);
    }

    public static double average(double[] array) {
        return DoubleStream.of(array).parallel().average().orElse(0);
    }

    public static void main(String[] args) {
        int[] ints = {2, 7, 3, 1, 0, 5, 8};
        System.out.println(Arrays.toString(ints));
        System.out.println("Average: " + average(ints));
        System.out.println();

        double[] doubles = {1.3, 7.5, 8.1, 9.2, 6.0};
        System.out.println(Arrays.toString(doubles));
        System.out.println("Average: " + average(doubles));
    }
}
