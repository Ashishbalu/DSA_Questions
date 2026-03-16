package array;

public class SecondSort0s1s2s {
    // This will include Dutch national flag algorithm i.e, an optimal approach
    // TC --> O(n)
    // SC --> O(1)

    static  void sortZeroOneTwo(int[] arr){
        // Initialize three pointer low and mid at 0, high at the end
        int low = 0, mid = 0, high = arr.length-1;

        while (mid<=high){
            // if current element is 0, swap it with low and move both pinter low and mid forward
            if (arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            // if current element is 1, just move mid forward
            else if (arr[mid] == 1){
                mid++;
            }
            // if current element is 2, swap with high and move only high backward
            else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 2, 0, 0, 0, 1, 1};
        sortZeroOneTwo(arr);

        for (int x : arr){
            System.out.println(x);
        }
    }
}
