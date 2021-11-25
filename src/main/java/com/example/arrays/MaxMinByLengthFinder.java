package com.example.arrays;

// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
// Знак "-" учитывается при вычислении длины.

import java.util.Arrays;
import java.util.Comparator;

public class MaxMinByLengthFinder {
    public static void main(String[] args) {
        Integer[] array = ConsoleInput.getIntegerArray();
        Arrays.sort(array, Comparator.comparingInt(o -> o.toString().length()));
        int shortestNumberLength = array[0].toString().length();
        int longestNumberLength = array[array.length-1].toString().length();
        System.out.printf("The minimum length of numbers in this array equals %d: %s\n", shortestNumberLength,
                Arrays.toString(Arrays.stream(array).filter(o -> o.toString().length() == shortestNumberLength).toArray()));
        System.out.printf("The maximum length of numbers in this array equals %d: %s\n", longestNumberLength,
                Arrays.toString(Arrays.stream(array).filter(o -> o.toString().length() == longestNumberLength).toArray()));
        System.out.println(Arrays.toString(array));
    }
}
