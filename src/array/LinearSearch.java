package array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 4, 2, 3, 1};
        int n = arr.length;
        int num = 4;
        int index = -1;
        for (int i = 0; i < n ; i++) {
            if (arr[i] == num){
                index = i;
                break;
            }
        }
        if (index != -1){
            System.out.println("Element found at index: " + index);
        }else {
            System.out.println("Element not found:");
        }
    }
}
