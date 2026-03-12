package array;

public class Sort0s1s2s {
    // This will be a better approach not brute and optimal
    // TC --> O(n)
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 2, 0, 0, 0, 1, 1};
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i <n ; i++) {
            if (arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            }else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i <count0 + count1 ; i++) {
            arr[i] = 1;
        }
        for (int i = count0 + count1; i <n ; i++) {
            arr[i] = 2;
        }

        for(int x : arr){
            System.out.println(x);
        }
    }
}
