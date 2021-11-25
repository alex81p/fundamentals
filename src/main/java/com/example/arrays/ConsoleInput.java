package com.example.arrays;

import java.util.Scanner;

public class ConsoleInput {
    public static Integer[] getIntegerArray(){
        boolean inputIsValid = false;
        int arrayLength = 1;
        do{
            System.out.print("Input the array length: ");
            try {
                Scanner scanner = new Scanner(System.in);
                arrayLength = scanner.nextInt();
                if (arrayLength < 2) {
                    System.out.println("The length of the array must be greater than 1.");
                    throw new Exception();
                }
                inputIsValid = true;
            } catch (Exception e) {
                System.out.println("Try again.");
                }
        } while (!inputIsValid);
        Integer[] array = new Integer[arrayLength];
        inputIsValid = false;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.printf("Input %d integers separated by spaces: ", arrayLength);
                for (int i = 0; i < arrayLength; i++) {
                    array[i] = scanner.nextInt();
                }
                inputIsValid = true;
            } catch (Exception e) {
                System.out.println("Try again.");
            }
        } while (!inputIsValid);
        return array;
    }
}
