package com.d9nich;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Jen",
                "George", "Alan", "Stacy", "Michelle", "john"};
        StringBuilder sb = Stream.of(names).parallel().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(sb);

    }
}
