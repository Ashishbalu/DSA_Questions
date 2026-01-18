package DSA_Que;

import java.util.Scanner;

public class SumOfNaturalNums {

    void sums(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sums(i - 1, sum + i);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        SumOfNaturalNums s1 = new SumOfNaturalNums();
        s1.sums(n, 0);
    }
}
