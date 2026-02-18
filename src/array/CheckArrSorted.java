package array;

public class CheckArrSorted {

    static boolean checkSorted(int[] arr, int n){
        for (int i = 1; i <n ; i++) {
            if (arr[i] >= arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};    //1,6,3,4,5
        int n = arr.length;
        boolean result = checkSorted(arr, n);
        if (result){
            System.out.println("Array is sorted.");
        }else {
            System.out.println("Array is not sorted.");
        }
    }
}
