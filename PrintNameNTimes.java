package DSA_Que;

import java.util.Scanner;

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