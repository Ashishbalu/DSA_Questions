package sorting;

import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr){

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i <=n-1 ; i++) {
            arr[i] = input.nextInt();
        }
    }
}
