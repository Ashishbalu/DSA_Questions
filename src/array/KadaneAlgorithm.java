package array;

public class KadaneAlgorithm {

    public static int kadanesAlgo(int[] nums){
        // this is an optimal approach for the maximum subarray problem
        // TC --> O(n)
        // SC --> O(1)
        int n = nums.length;

        long max = Long.MIN_VALUE;
        long sum = 0;

        for (int i = 0; i <n ; i++) {
            sum += nums[i];

            if (sum > max){
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return (int) max;

    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int res = kadanesAlgo(arr);
        System.out.println("the maximum subarray will be: " + res);
    }
}
