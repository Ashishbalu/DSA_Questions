package array;

import java.util.HashMap;

public class SubArrSumK {

    // this one is optimal solution of this problem

    public int subarraySum(int[] arr, int k){
        int n = arr.length;
        //Map to store the frequency of prefix sum
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //initialize prefix sum and count of sub arrays
        int prefixSum = 0;
        int cnt = 0;

        // base case: prefix sum 0 has occured once
        mpp.put(0, 1);

        //traverse through the array
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // calculates the sum of prefix that needs to be removed
            int remove = prefixSum - k;

            //if the prefix sum has been seen before
            //add its count to the result
            if (mpp.containsKey(remove)){
                cnt += mpp.get(remove);
            }

            //update the frequency of the current prefix sum
            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
        }
        // return total count of subArrays
        return cnt;
    }


    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;

        SubArrSumK obj = new SubArrSumK();
        int result = obj.subarraySum(arr, k);
        System.out.println("The number of subArrays is " + result);
    }
}
