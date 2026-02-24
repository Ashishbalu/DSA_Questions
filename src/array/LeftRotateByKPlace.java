package array;

public class LeftRotateByKPlace {

    void  reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public int[] leftRotate(int[] arr, int k, String direction){
        int n = arr.length;
        k = k%n;
        if (direction.equals("left")){
            reverseArray(arr, 0, k-1);
            reverseArray(arr, k, n-1);
            reverseArray(arr, 0, n-1);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        String direction = "left";

        LeftRotateByKPlace leftR = new LeftRotateByKPlace();

       int[] result = leftR.leftRotate(arr, k, direction);
       for (int num: arr){
           System.out.print(num + " ");
       }
    }
}
