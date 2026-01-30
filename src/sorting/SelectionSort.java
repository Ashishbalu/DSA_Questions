package sorting;

import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(int[] arr, int n){
        for (int i = 0; i <=n-2 ; i++) {
            int min = i;

            for (int j = i; j <=n-1 ; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp;
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array:");
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        selectionSort(arr, n);
        System.out.println("Sorted Array: ");
        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
