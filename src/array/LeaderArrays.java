package array;

public class LeaderArrays {
    // in this algorithm, have to find out the leader elements means everything on the right should be smallest
    // this is a brute force approach
    //TC --> O(n*n) n square
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;

        for (int i = 0; i <n ; i++) {
            boolean leader = true;
            for (int j = i+1; j <n ; j++) {
                if (arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if (leader == true){
                System.out.println(arr[i]);
            }
        }
    }
}
