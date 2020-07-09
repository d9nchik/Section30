package com.d9nich;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Enter ten students: ");

        Scanner input = new Scanner(System.in);

        Student[] array = new Student[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter student name: ");
            String name = input.next();
            System.out.print("Enter score of " + name + ": ");
            array[i] = new Student(name, input.nextInt());
        }

        Arrays.stream(array).sorted(Comparator.comparing(
                Student::getScores).reversed().thenComparing(Student::getName)).sequential().forEach(System.out::println);
    }


    static class Student {
        private final String name;
        private final int scores;

        public Student(String name, int scores) {
            this.name = name;
            this.scores = scores;
        }

        public String getName() {
            return name;
        }

        public int getScores() {
            return scores;
        }

        @Override
        public String toString() {
            return "Student{" + "name='" + name + '\'' +
                    ", scores=" + scores +
                    '}';
        }
    }
}

