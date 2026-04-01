package array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement2 {

    public static int majorityElement(int[] nums){
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        //count occurrences of each element
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Iterate through the map to find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > n/2) {
                return entry.getKey();
            }
        }
        // Retrun -1 if no majority element is found
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("the majority element is: " + ans);
    }
}
