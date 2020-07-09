package com.d9nich;

import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise5 {
    public static void main(String[] args) {

        IntStream.of(new Random().ints(200, 0, 10).toArray())
                .parallel().boxed().collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
