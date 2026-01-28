package hashing;

import java.util.Scanner;
public class CountString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String s = input.next();


        //pre compute frequencies
        int[] hash = new int[26];
        for (int i = 0; i <s.length() ; i++) {
            hash[s.charAt(i) - 'a']++;
        }

        System.out.println("Enter the query number here: ");
        int q = input.nextInt();

        System.out.println("check the frequencies here: ");
        while(q-- > 0){
            char c = input.next().charAt(0);
            System.out.println(hash[c-'a']);
        }

    }
}
