package com.example.matrix;

// 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

import java.util.Arrays;
import java.util.Comparator;

public class MatrixSorter {
    public static void main(String[] args) {
        int[][] matrix = CommonMethods.getMatrix();
        CommonMethods.printMatrix(matrix);
        int matrixOrder = matrix.length;
        int column = CommonMethods.getIntFromConsole(o -> o > 0 && o <= matrixOrder,
                "Choose a column, by which you want to sort the matrix: ",
                "Try again. Enter an integer from 1 to " + matrixOrder + ".") - 1;
        sortMatrixByColumn(matrix, column);
        System.out.println("Matrix sorted by the column:");
        CommonMethods.printMatrix(matrix);
        int row = CommonMethods.getIntFromConsole(o -> o > 0 && o <= matrixOrder,
                "Choose a row, by which you want to sort the matrix: ",
                "Try again. Enter an integer from 1 to " + matrixOrder + ".") - 1;
        sortMatrixByRow(matrix, row);
        System.out.println("Matrix sorted by the row:");
        CommonMethods.printMatrix(matrix);
    }
    public static void sortMatrixByColumn (int[][] matrix, int column){
        Arrays.sort(matrix, Comparator.comparingInt(o -> o[column]));
    }
    public static void sortMatrixByRow (int[][] matrix, int row){
        int[][] transposedMatrix = getTransposedMatrix(matrix);
        sortMatrixByColumn(transposedMatrix, row);
        int[][] sortedMatrix = getTransposedMatrix(transposedMatrix);
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(sortedMatrix[i], 0, matrix[i], 0, matrix[0].length);
        }
    }
    public static int[][] getTransposedMatrix(int[][] matrix){
        int[][] transposedMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}
