package array;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
To generate the entire Pascal’s Triangle for the first N rows,
we can start with the first row containing a single 1 and iteratively build each subsequent row using the property that every element (except the first and last) is the sum of the two elements directly above it from the previous row.
The first and last elements of each row are always 1. By storing the previous row, we can calculate the next row easily. This process continues until we have constructed all N rows, resulting in the complete Pascal’s Triangle structure.
 */
public class PascalTriangle3 {
    public List<List<Integer>> generate(int N){
        List<List<Integer>> triangle = new ArrayList<>();

        //loop for each row
        for (int i = 0; i <N ; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i+1, 1));
            for (int j = 1; j < i; j++) {
                row.set(j, triangle.get(i-1).get(j-1) +
                        triangle.get(i-1).get(j));
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalTriangle3 obj = new PascalTriangle3();
        int n = 5;
        List<List<Integer>> result = obj.generate(n);
        for (List<Integer> row : result){
            for (Integer val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
