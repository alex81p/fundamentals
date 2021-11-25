package com.example.arrays;

import java.util.Arrays;

// 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
// Знак "-" учитывается при вычислении длины.

public class ByLengthFilter {
    public static void main(String[] args) {
        Integer[] array = ConsoleInput.getIntegerArray();
        double averageLength = Arrays.stream(array).mapToDouble(o -> o.toString().length()).sum() / array.length;
        System.out.println("The average length of numbers in the array: " + averageLength);
        System.out.print("Numbers (and their length), which length is smaller then the average: ");
        Arrays.stream(Arrays.stream(array).filter(o -> o.toString().length() < averageLength).toArray())
                .forEach(o -> System.out.printf("%s (%d) ", o, o.toString().length()));
        System.out.println();
        System.out.print("Numbers (and their length), which length is greater then the average: ");
        Arrays.stream(Arrays.stream(array).filter(o -> o.toString().length() > averageLength).toArray())
                .forEach(o -> System.out.printf("%s (%d) ", o, o.toString().length()));
        System.out.println();
    }
}
