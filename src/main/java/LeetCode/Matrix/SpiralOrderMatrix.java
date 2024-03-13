package LeetCode.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
public static List<Integer> SpiralOrderMatrix(int[][] matrix){
    List<Integer> result = new ArrayList<>();
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
        return result;
    }

    int rows = matrix.length;
    int cols = matrix[0].length;

    int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

    while( top <= bottom && left <= right){
        //left to right
        for (int j = left; j<= right ; j++){
            result.add(matrix[top][j]);
        }
        top++;

        //down
        for(int i =top; i <= bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;
         //left
        if(top <= bottom){
            for (int j = right; j >= left; j--){
                result.add(matrix[bottom][j]);
            }
            bottom--;
        }
        //up
        if(left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }
    }
    return result;
}

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = SpiralOrderMatrix(matrix);
        System.out.println(result);
    }
}

