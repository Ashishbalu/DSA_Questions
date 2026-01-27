package DSA_Que;

import java.util.Scanner;

// This is belongs to the recursion basics just to understand that how the recursion works

public class PrintNameNTimes {
    void print(int i, int n){
        if (i>n){
            return;
        }
        System.out.println("/*Your Name here*/");
        print(i+1, n);
    }

    public static void main(String[] args) {
        PrintNameNTimes n1 = new PrintNameNTimes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n here: ");
        int n = sc.nextInt();
        n1.print(1, n);
    }
}