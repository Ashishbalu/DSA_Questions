package array;

import java.util.HashMap;

public class TwoSum {
    // Optimal approach
    // TC --> O(n)
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = arr[i];
            int more = target - a;
            if (map.containsKey(more)){
                System.out.println("YES");
                return;
            }
            map.put(a, i);
        }
        System.out.println("NO");
    }
}
