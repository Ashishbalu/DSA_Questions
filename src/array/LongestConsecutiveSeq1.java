package array;

public class LongestConsecutiveSeq1 {
    //this will be a brute force approach
    public boolean linerSearch(int[] arr, int num){

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public int longestSubsequence(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        int n = nums.length;
        int longest = 1;
        for (int i = 0; i <n ; i++) {
            int x = nums[i];
            int cnt = 1;

            while (linerSearch(nums, x+1) == true){
                x += 1;

                cnt += 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        LongestConsecutiveSeq1 lsq = new LongestConsecutiveSeq1();
        System.out.println(lsq.longestSubsequence(arr));
    }
}
