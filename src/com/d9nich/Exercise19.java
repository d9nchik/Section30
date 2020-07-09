package com.d9nich;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise19 {
    public static void main(String[] args) {
        System.out.print("Enter path to file: ");
        try {
            DoubleSummaryStatistics stats =
                    Files.lines(new File(new Scanner(System.in).next()).toPath()).parallel()
                            .map(e -> Arrays.stream(e.split(" +"))).reduce(Stream::concat).orElseThrow()
                            .mapToDouble(Double::parseDouble).summaryStatistics();

            System.out.println("The summary of the stream is");
            System.out.printf("Count:%14d\n", stats.getCount());
            System.out.printf("Max:%16.2f\n", stats.getMax());
            System.out.printf("Min:%16.2f\n", stats.getMin());
            System.out.printf("Sum:%16.2f\n", stats.getSum());
            System.out.printf("Average:%12.2f\n", stats.getAverage());

        } catch (IOException ex) {
            System.out.println("Check is yor path valid!");
        }
    }
}
