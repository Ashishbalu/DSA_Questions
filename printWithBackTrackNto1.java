package DSA_Que;

import java.util.Scanner;

public class printWithBackTrackNto1 {
    void print(int i, int n){
        if (i>n){
            return;
        }
        print(i+1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n here: ");
        int n = input.nextInt();
        printWithBackTrackNto1 b2 = new printWithBackTrackNto1();
        b2.print(1, n);
    }
}
