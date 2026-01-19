package DSA_Que;

public class SumOfN {

    // using functional recursion

    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        int result = sum(3);
        System.out.println("The result is: " + result);
    }
}
