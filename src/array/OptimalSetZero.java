package array;

public class OptimalSetZero {

    public void setZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        //flag to track if first row & column should be zeroed
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        // use first/row n column as marker
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // set cells to zero based on markers
        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // zero the first row if needed
        if (firstRowZero){
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        // zero the first column if needed
        if (firstColZero){
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        OptimalSetZero obj = new OptimalSetZero();
        obj.setZero(matrix);
        for (int[] row : matrix){
            for (int val :row){
                System.out.print(val +  " ");
            }
            System.out.println();
        }
    }
}
