package array;

public class RemoveDuplicates {

    static int removeDup(int[] arr, int n){
        int i = 0;
        for (int j = 1; j < n ; j++) {
            if (arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int n = arr.length;
        int result = removeDup(arr, n);
        System.out.println(result);

        for (int i = 0; i <result ; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
