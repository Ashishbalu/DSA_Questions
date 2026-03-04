package array;

public class MaxConsecutiveOne {
    // Time complexity -> O(n)
    // Space complexity -> O(1)
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        int n = arr.length;
        int count = 0;
        int max = 0;

        for (int i = 0; i <n ; i++) {
            if (arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}
