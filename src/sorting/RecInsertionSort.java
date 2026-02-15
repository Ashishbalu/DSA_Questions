package sorting;

import java.util.Scanner;

public class RecInsertionSort {

    static void recursiveInsertionSort(int[] arr, int i, int n) {
        if (i == n) {
            return;
        }

        int j = i;

        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        recursiveInsertionSort(arr, 0, n);
        System.out.println("Array after recursion: ");
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
