package array;

/*
----> this is the better but can be optimise using minimum number of iteration
To find the element at the coordinates (R,C) where R is the row number and C is the Column number, we can simply simulate the generation of pascal's triangle for R rows. In Pascal’s Triangle, the element at row R and column C corresponds to the binomial coefficient (r-1)C(c-1). To calculate this binomial coefficient, we can simply apply the formula of binomial coefficient i.e. (r-1)!/(c-1)!(r-c)!.

Instead of computing full factorials (which can overflow and be slow), we can multiply and divide in a loop to compute the coefficient efficiently.
*/
public class PascalTriangle1 {

    public long findPascalElement(int r, int c) {
        // Element is C(r-1. c-1)
        int n = r - 1;
        int k = c - 1;

        long res = 1;

        //compute the C(n, k) using iterative formula
        for (int i = 0; i < k; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        PascalTriangle1 obj = new PascalTriangle1();
        int r = 5, c = 3;
        System.out.println(obj.findPascalElement(r, c));
    }
}
