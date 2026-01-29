package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighLowFreqOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = input.nextInt();

        System.out.println("Enter The Array Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = input.nextInt();
        }

        // Create and store in hashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store the frequencies
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Enter the query digit: ");
        int q = input.nextInt();

        System.out.println("Check the frequencies");
        while (q-->0){
            int number = input.nextInt();
            System.out.println(map.getOrDefault(number, 0));
        }

        //cheking the highest and lowest frequency of elements
        System.out.println("showing the highest and lowest frequencies: ");
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;

        int minElement = 0;
        int maxElement = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int freq = entry.getValue();

            if (freq < minFreq){
                minFreq = freq;
                minElement = element;
            }
            if (freq > maxFreq){
                maxFreq = freq;
                maxElement = element;
            }
        }
        System.out.println("Minimum Frequency: " + minElement + " --> " + minFreq);
        System.out.println("Maximum Frequency: " + maxElement + " --> " + maxFreq);


    }
}
