package sorting;

public class BubbleSort {
    static void bubbleSort(int[] arr, int n) {

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubbleSort(arr, arr.length);
       for(int x : arr) {
           System.out.println(x);
       }
    }
}
