package array;

public class MajorityElement3 {
    // this is optimal approach for the majority element

    public static int majorityElements(int[] nums){
        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for (int i = 0; i <n ; i++) {
            if (cnt == 0){
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            }else {
                cnt--;
            }
        }
        int cnt1 = 0;
        for (int i = 0; i <n ; i++) {
            if (nums[i] == el){
                cnt1++;
            }
        }
        if (cnt1 > (n/2)){
            return el;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 7, 5};

        int ans = majorityElements(arr);
        System.out.println("the majority element is: " + ans);
    }
}
