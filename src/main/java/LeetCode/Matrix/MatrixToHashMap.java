package LeetCode.Matrix;

import java.util.HashMap;
import java.util.Map;

public class MatrixToHashMap {

    public static Map<String, Integer> matrixToHashMap(int[][] matrix) {
        Map<String, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String key ="[" +i + "," + j +"]";  // You can choose any appropriate key based on your requirements
                int value = matrix[i][j];
                hashmap.put(key, value);
            }
        }

        return hashmap;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Map<String, Integer> result = matrixToHashMap(matrix);
        System.out.println(result);
    }
}
