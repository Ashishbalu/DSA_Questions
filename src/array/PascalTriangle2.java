package array;


import java.util.ArrayList;
import java.util.List;

/*
To print the Nth row of the pascal triangle we can take advantage of the relationship between Nth element and binomial coefficients.

In a pascal's triangle, the Nth row contains the binomial coefficients C(N-1, 0), C(N-1, 1) and so on till C(N-1, N-1). Thus we can simply calculate all these values to return the Nth row of pascal triangle.

Instead of computing full factorials, we can start with the first value as 1, and use the relation C(n, k) = C(n, k−1) × (n−k+1) / k to compute the next value from the previous one in constant time.
*/
public class PascalTriangle2 {

    public List<Long> findNthRow(int n) {
        // result list to store the row
        List<Long> row = new ArrayList<>();

        // first value of row will always be 1
        long val = 1;
        row.add(val);

        for (int i = 1; i < n; i++) {
            val = val * (n - i) / i;
            row.add(val);
        }
        return row;
    }


    public static void main(String[] args) {
        int n = 5;
        PascalTriangle2 obj = new PascalTriangle2();

        List<Long> result = obj.findNthRow(n);

        //print the row
        for (long num : result) {
            System.out.print(num + " ");
        }

    }
}
