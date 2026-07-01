package array;

public class RotateMatrix90 {

    public void rotateClockWise(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        //Reverse the matrix 
        for (int i = 0; i < n; i++) {
            int left = 0, right = n-1;

            //Swap elements from both ends moving towards center
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotateMatrix90 obj = new RotateMatrix90();
        obj.rotateClockWise(matrix);

        //print rotated matrix
        for (int[] row : matrix){
            for (int val : row){
                System.out.print(val + " ");
            }
                System.out.println();
        }
    }
}
