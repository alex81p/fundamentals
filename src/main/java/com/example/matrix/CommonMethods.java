package com.example.matrix;

import java.util.Random;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class CommonMethods {
    public static int[][] getMatrix(){
        int matrixOrder = getIntFromConsole(o -> o > 1 && o < 101,
                "Creating a n*n matrix. Enter the order of the matrix (n): ",
                "Try again. Enter an integer from 2 to 100.");
        int elementsRange = getIntFromConsole(o -> o > 0 && o < 1_000_000_001,
                "Enter the range (from -M to M) of it's elements (M): ",
                "Try again. Enter an integer from 1 to 10^9.");
        int[][] matrix = new int[matrixOrder][matrixOrder];
        Random random = new Random();
        for (int i = 0; i < matrixOrder; i++) {
            for (int j = 0; j < matrixOrder; j++) {
                matrix[i][j] = random.nextInt(elementsRange * 2 + 1) - elementsRange;
            }
        }
        System.out.println("The matrix has been created.");
        return matrix;
    }

    public static int getIntFromConsole (IntPredicate predicate, String question, String errorMessage){
        int input = 0;
        boolean inputIsValid = false;
        do {
            System.out.print(question);
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                if (!predicate.test(input)){
                    throw new Exception();
                }
                inputIsValid = true;
            } catch (Exception e){
                System.out.println(errorMessage);
            }
        } while (!inputIsValid);
        return  input;
    }

    public static void printMatrix (int[][] matrix){
        if (matrix.length == 0 || matrix[0].length == 0){
            System.out.println("The matrix is empty.");
            return;
        }
        int [] columnWidth = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            columnWidth[j] = String.valueOf(matrix[0][j]).length();
            for (int i = 1; i < matrix.length; i++) {
                if (columnWidth[j] < String.valueOf(matrix[i][j]).length()){
                    columnWidth[j] = String.valueOf(matrix[i][j]).length();
                }
            }
        }
        for (int[] row : matrix) {
            System.out.print("‖");
            for (int i = 0; i < row.length; i++) {
                for (int j = 0; j <= columnWidth[i] - String.valueOf(row[i]).length(); j++) {
                    System.out.print(" ");
                }
                System.out.print(row[i]);
            }
            System.out.println(" ‖");
        }
    }
}
