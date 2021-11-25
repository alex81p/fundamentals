package com.example.arrays;

// 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
// Знак "-" не учитывается.

public class LeastDifferentDigitsNumberFinder {
    public static void main(String[] args) {
        Integer[] array = ConsoleInput.getIntegerArray();
        int leastNumberOfDifferentDigits = 11;
        int indexOfNumberWithLeastDifferentDigits = 0;
        for (int i = 0; i < array.length; i++) {
            int numberOfDifferentDigits = 0;
            int[] digits = String.valueOf(Math.abs(array[i])).chars().toArray();
            for (int j = 0; j < digits.length; j++) {
                int k = 0;
                boolean isRepeatedDigit = false;
                while (k < j && !isRepeatedDigit) {
                    isRepeatedDigit = digits[j] == digits[k];
                    k++;
                }
                if (!isRepeatedDigit){
                numberOfDifferentDigits++;
                }
            }
            if (numberOfDifferentDigits < leastNumberOfDifferentDigits){
                leastNumberOfDifferentDigits = numberOfDifferentDigits;
                indexOfNumberWithLeastDifferentDigits = i;
            }
        }
        System.out.println("The number (one of the numbers) with least different digits is " +
                array[indexOfNumberWithLeastDifferentDigits]);
    }
}
