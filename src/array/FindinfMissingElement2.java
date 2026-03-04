package array;

public class FindinfMissingElement2 {
    // Optimal approach
    // Time complexity -> O(n)
    public static void main(String[] args) {
       int[] arr = {1, 2, 4, 5};
       int n = arr.length;
       int xor1 = 0;
       int xor2 = 0;

        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
        }
        for (int i = 1; i <= n+1 ; i++) {
            xor1 = xor1 ^ i;
        }
        int result = xor1 ^ xor2;
        System.out.println("Missing element is: " + result);
    }
}
