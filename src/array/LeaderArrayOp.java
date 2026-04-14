package array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderArrayOp {
 // this is an optimal solution for the leader finder
    // TC --> O(n)
    // SC --> O(1)
    public ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        if (arr.length == 0){
            return ans;
        }
        int max = arr[arr.length -1];
        ans.add(arr[arr.length-1]);

        for (int i = arr.length-2; i >= 0 ; i--) {
            if (max< arr[i]){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);

        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        LeaderArrayOp op = new LeaderArrayOp();
        ArrayList<Integer> ans = op.leaders(arr);

        System.out.println("leaders elements of the array: ");
        for (int x : ans){
            System.out.println(x + " ");
        }
        System.out.println();
    }
}
