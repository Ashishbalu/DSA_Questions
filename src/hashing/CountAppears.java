package hashing;

import java.util.Scanner;

public class CountAppears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }

        int hash[] = new int[13];
        for (int i = 0; i <n ; i++) {
            hash[arr[i]] += 1;
        }

        int q = input.nextInt();
        while(q-- > 0){
        int number = input.nextInt();
            System.out.println(hash[number]);
        }
    }
}
