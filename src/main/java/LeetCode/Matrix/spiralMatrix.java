package LeetCode.Matrix;

public class spiralMatrix {

    //Given an m x n matrix,
    // return all elements of the matrix in spiral order.


    public static void printMatrix(int [][] matrix, int rows,int col){

       //first line
        for (int i = 0 ; i < 1; i++){
            for (int j = 0; j < col; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
        }
//most right line
        for (int i = 1 ; i < rows ; i++){
            for (int j = col-1; j < col; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
        }
        //last line
        for (int i = 2 ; i < 3; i++){
            for (int j = 1; j >= 0; j--){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
        }
        /// 4
        for (int i = 1 ; i >0; i--){
            for (int j = 0; j <1 ; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
        }
        // 5
        for (int i = 1 ; i < rows-1; i++){
            for (int j = 1; j <col-1 ; j++){
                System.out.print("," +matrix[i][j] + "---->index" +"["+i+"]" +"["+ j+ "]");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int rows = matrix.length;
        int col = matrix[0].length;
        printMatrix(matrix,rows,col);

    }
}
