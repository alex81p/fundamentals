package com.example.matrix;

// 4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие

import java.util.Arrays;

public class RowsAndColumnsRemover {
    public static void main(String[] args) {
        int[][] matrix = CommonMethods.getMatrix();
        System.out.println("Initial matrix:");
        CommonMethods.printMatrix(matrix);
        int maxElement = Arrays.stream(matrix).mapToInt(o -> Arrays.stream(o).max().getAsInt()).max().getAsInt();
        System.out.printf("The biggest element in the matrix is %d.\n" +
                "All rows and columns containing this element have been removed.\n" +
                "Resulting matrix:\n", maxElement);
        matrix = getRemovedRowsAndColumnsMatrix(matrix, maxElement);
        CommonMethods.printMatrix(matrix);
    }
    public static int[][] getRemovedRowsAndColumnsMatrix(int[][] matrix, int element) {
        int[] rowsToBeRemoved = new int[matrix.length];
        int[] columnsToBeRemoved = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == element) {
                    rowsToBeRemoved[i] = 1;
                    columnsToBeRemoved[j] = 1;
                }
            }
        }
        int[][] cutMatrix = new int[matrix.length - Arrays.stream(rowsToBeRemoved).sum()]
                [matrix.length - Arrays.stream(columnsToBeRemoved).sum()];
        for (int i = 0, m = 0; i < matrix.length; i++) {
            if (rowsToBeRemoved[i] == 1) {
                continue;
            }
            for (int j = 0, n = 0; j < matrix.length; j++) {
                if (columnsToBeRemoved[j] == 1) {
                    continue;
                }
                cutMatrix[m][n] = matrix[i][j];
                n++;
            }
            m++;
        }
        return cutMatrix;
    }
}
