package array;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 7};

        int n = arr.length;
        int largest = arr[0];
        int secLargest = -1;
        for (int i = 0; i < n ; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println("first largest element is: " + largest + ", Second Lagest is: " + secLargest);
    }
}
