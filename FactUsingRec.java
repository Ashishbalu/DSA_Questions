package DSA_Que;

public class FactUsingRec {
               //Factorial using recursion...
    static int fact(int n){
        if (n == 1){
            return 1;
        }
        return n * fact(n-1);
    }


    public static void main(String[] args) {
        int res = fact(4);
        System.out.println("The factorial of n is: " + res);
    }
}
