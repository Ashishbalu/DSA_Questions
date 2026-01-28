package hashing;

import java.util.Scanner;

public class CountAppears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = input.nextInt();

        int arr[] = new int[n];
        System.out.println("enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int hash[] = new int[13];
        System.out.println("Enter the number of queries: ");
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = input.nextInt();
        System.out.println("Check the number how many times it appears: ");
        while (q-- > 0) {
            int number = input.nextInt();
            System.out.println(hash[number]);
        }
    }
}
