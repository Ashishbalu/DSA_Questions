package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSortedArr2 {
    // Two pointer approach for sorted arrays
    // Time Complexity: O(n1 + n2)
    // Space Complexity: O(min(n1, n2))

    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3};
        int[] B = {2, 2, 3, 4};
        int n1 = A.length;
        int n2 = B.length;
        int i = 0;
        int j = 0;
        List<Integer> intersection = new ArrayList<>();

        while (i < n1 && j < n2){
            if (A[i] < B[j]){
                i++;
            } else if (B[j] < A[i]) {
                j++;
            }else {
                intersection.add(A[i]);
                i++;
                j++;
            }
        }
        for(int x : intersection){
            System.out.println(x);
        }
    }
}
