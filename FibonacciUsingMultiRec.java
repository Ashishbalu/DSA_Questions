package DSA_Que;

public class FibonacciUsingMultiRec {
       // Finding fibonacci numbers using multiple recursion
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fib(n - 1);
        int sLast = fib(n - 2);
        return last + sLast;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
