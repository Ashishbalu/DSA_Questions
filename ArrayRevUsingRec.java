package DSA_Que;

public class ArrayRevUsingRec {
    // Array reverse using recursion with two pointers

    static void rev(int[] arr,int l, int r){
        if (l>=r){
            return;
        }
        int temp;
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        rev(arr, l+1, r-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        rev(arr, 0, arr.length-1);
        for (int num : arr){
            System.out.println(num);
        }
    }
}
