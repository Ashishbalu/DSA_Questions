package DSA_Que;

// // This is belongs to the recursion basics just to understand that how the recursion works -->> print linearly but with backtrack..

import java.util.Scanner;

public class printWithBackTrack1toN {
    void print(int i, int n){
        if (i<1){
            return;
        }
        print(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n here: ");
        int n = input.nextInt();
        printWithBackTrack1toN b1 = new printWithBackTrack1toN();
        b1.print(n, n);
    }
}
