package sorting;

import java.util.Scanner;

public class RecBubbleSort {

    static void recursiveBubbleSort(int[] arr, int n){
       if (n == 1){
           return ;
       }
        for (int i = 0; i < n-1 ; i++) {
            if (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        recursiveBubbleSort(arr, n -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("The array before sorting: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        recursiveBubbleSort(arr, n);

        System.out.println("The array after sorting: ");
        for(int x : arr){
            System.out.println(x + " ");
        }
    }
}
