package LeetCode.Matrix;

import java.util.HashMap;
import java.util.Map;

public class SetMatrixZeros1 {//using hashmap

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        Map<Integer, Boolean> zeroRows = new HashMap<>();
        Map<Integer, Boolean> zeroCols = new HashMap<>();

        // Iterate through the matrix and mark rows and columns containing zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.put(i, true);
                    zeroCols.put(j, true);
                }
            }
        }

        // Set zeros based on marked rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows.containsKey(i) || zeroCols.containsKey(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("\nMatrix After Setting Zeros:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

