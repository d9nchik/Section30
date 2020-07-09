package com.d9nich;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Exercise7 {
    public static double max(double[] array) {
        return DoubleStream.of(array).parallel().reduce(Double.MIN_VALUE, Math::max);
    }

    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");

        Scanner input = new Scanner(System.in);

        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        System.out.println("The maximum number is: " + max(array));
    }
}
