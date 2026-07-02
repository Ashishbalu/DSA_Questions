package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        // create a list to store the spiral order
        List<Integer> result = new ArrayList<>();

        //Initialize the boundaries
        int top = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length - 1;
        int left = 0;

        while (top <= bottom && left <= right) {


            //traverse the top row from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // move the top boundary downward

            //traverse the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // move the right boundary leftward

            //traverse the bottom row from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // move the bottom boundary upward
            }

            //traverse the left column for bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;  // move the left boundary rightward
            }
        }
        return result;
    }


    public static void main(String[] args) {
        // Input matrix
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        SpiralMatrix obj = new SpiralMatrix();
        List<Integer> ans = obj.spiralOrder(matrix);
        System.out.println(ans);
    }
}
