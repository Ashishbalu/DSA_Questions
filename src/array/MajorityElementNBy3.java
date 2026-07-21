package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3 {

    public List<Integer> majorityElement(int[] nums){
        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        int mini = n/3+1;

        for (int i = 0; i < n ; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            if (mpp.get(nums[i]) == mini){
                list.add(nums[i]);
            }
            if (list.size() == 2) break;
        }
        return list;
    }



    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 2, 2, 3, 2};
        MajorityElementNBy3 obj = new MajorityElementNBy3();
        List<Integer> result = obj.majorityElement(arr);
        System.out.println("the majority elements are: ");
        for (int it : result){
            System.out.print(it + " ");
        }
        System.out.println();
    }
}
