package com.example.arrays;

import java.util.Arrays;
import java.util.Comparator;

// 2. Вывести числа в порядке возрастания (убывания) значений их длины.
// Знак "-" учитывается при вычислении длины.

public class ByLengthSorter {
    public static void main(String[] args) {
        Integer[] array = ConsoleInput.getIntegerArray();
        Arrays.sort(array, Comparator.comparingInt(o -> o.toString().length()));
        System.out.printf("The array sorted by length of numbers: %s\n", Arrays.toString(array));
        Arrays.sort(array, Comparator.comparingInt(o -> -o.toString().length()));
        System.out.printf("The array sorted by length of numbers in reverse order: %s\n", Arrays.toString(array));
    }
}
