package LeetCode.Matrix;

import java.util.HashMap;

public class setAgain {

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row contains zero
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column contains zero
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Marking the corresponding row
                    matrix[0][j] = 0;  // Marking the corresponding column
                }
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
            System.out.println();
        }

        // Set zeros based on markings
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // Set zeros for the first row and first column if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void printMatrix(int [][] matrix){
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] matrix =  {{1,0,1},{1,1,1},{1,1,1}};
        setZeroes(matrix);
        System.out.println("--------------");
        System.out.println();
        printMatrix(matrix);

    }
}
