package DSA_Que;

import java.util.Scanner;

public class ArrayRev2Rec {
    static void rev(int[] arr, int i, int n){
        if (i>= n/2){
            return;
        }
        int temp;
        temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        rev(arr, i+1, n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }
        rev(arr, 0, n);

        System.out.println("Reversed array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
