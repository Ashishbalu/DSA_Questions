package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class numberUsingHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the digits: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        //Store frequencies
        for (int i = 0; i <n ; i++) {
           map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Enter the query: ");
        int q = input.nextInt();

        System.out.println("Check the frequencies: ");
        while(q-- > 0){
             int number = input.nextInt();
            System.out.println(map.getOrDefault(number, 0));
        }
    }
}
