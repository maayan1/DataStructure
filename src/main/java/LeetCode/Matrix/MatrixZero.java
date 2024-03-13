package LeetCode.Matrix;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MatrixZero {

    public void setZeroes(int[][] matrix) {
        HashMap<Integer, Integer> saveIndexes = new HashMap<>();

        int saveIndexI = 0;
        int saveIndexJ = 0;
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");

                if(matrix[i][j] == 0){
                    saveIndexI=i;

                }

            }
            System.out.println();
        }
       changeToZero(matrix,saveIndexI,saveIndexJ);
    }

    public void changeToZero(int [][] matrix, int iIndex, int jIndex){
        for (int i = 0; i < matrix.length; i++){
            for (int j=0;j< matrix.length;j++){
                if( i == iIndex ){
                    matrix[i][j] = 0;
                }
                if(j==jIndex){
                    matrix[i][j] = 0;

                }
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
        int [][] matrix2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        MatrixZero matrixZero = new MatrixZero();
        matrixZero.setZeroes(matrix);
       // System.out.println("change all lines 1 to 0");
       // printMatrix(matrix);
    }

}
