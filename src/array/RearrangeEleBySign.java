package array;

public class RearrangeEleBySign {
    public static void main(String[] args) {
        int [] arr = {3, 1, -2, -5, 2, -4};
        int n = arr.length;
        int[] result = new int[n];
        int positive = 0;
        int negative = 1;


        for (int i = 0; i <n ; i++) {
            if (arr[i] > 0){
                result[positive] = arr[i];
                positive +=2;
            }else {
                result[negative] = arr[i];
                negative +=2;
            }
        }
       for (int i = 0; i<n; i++){
           System.out.println(result[i] + " ");
       }
    }
}
