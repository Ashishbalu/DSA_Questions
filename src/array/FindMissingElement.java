package array;

public class FindMissingElement {
    //brute force approach
    //time complexity -> O(n*n)
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length;
        for (int i = 1; i <= n + 1; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Missing element: " + i);
            }
        }
    }
}
