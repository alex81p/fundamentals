package com.example;

import java.math.BigInteger;
import java.util.Arrays;

// 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class SumAndProductCalculator {
    public static void main(String[] args) {
        if (args == null || args.length < 2){
            System.out.println("Run the program with two or more parameters.");
            System.exit(0);
        }
        BigInteger sum = new BigInteger("0");
        BigInteger product = new BigInteger("1");
        BigInteger argument = new BigInteger("0");
        for (int i = 0; i < args.length; i++) {
            try {
                argument = new BigInteger(args[i]);
            } catch (Exception e){
                System.out.println(e.getMessage() + "\nInvalid argument. Run the program with two or more integers as parameters.");
                System.exit(0);
            }
            sum = sum.add(argument);
            product = product.multiply(argument);
        }
        System.out.println("Array: " + Arrays.toString(args));
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
