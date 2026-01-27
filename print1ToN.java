package DSA_Que;

import java.util.Scanner;

// This is belongs to the recursion basics just to understand that how the recursion works --->> print linearly 1 to n...

public class print1ToN {
    void print(int i, int n){
        if (i>n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        print1ToN n1 = new print1ToN();
        n1.print(1, n);
    }
}
