package com.example;

import java.util.Random;
import java.util.Scanner;

// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int arrayLength = 1;
        boolean lengthIsValid = false;
        do {
            System.out.print("Specify the length of the array: ");
            try {
                Scanner scanner = new Scanner(System.in);
                arrayLength = scanner.nextInt();
                if (arrayLength < 1){
                    throw new Exception();
                }
                lengthIsValid = true;
            } catch (Exception e){
                System.out.println("Try again. Input a positive integer.");
            }
        } while (!lengthIsValid);
        int[] arrayOfRandomNumbers = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arrayOfRandomNumbers[i] = random.nextInt();
        }
        System.out.println("\nThe array displayed as a string:");
        for (int number : arrayOfRandomNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nThe array displayed as a column:");
        for (int number : arrayOfRandomNumbers) {
            System.out.println(number);
        }
    }
}
