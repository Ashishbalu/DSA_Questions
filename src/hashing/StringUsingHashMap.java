package hashing;

import java.util.HashMap;
import java.util.Scanner;

public class StringUsingHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String here: ");
        String s = input.next();


        HashMap<Character, Integer> map = new HashMap<>();
        // build frequency map
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println("Enter the query counts: ");
        int q = input.nextInt();

        System.out.println("Check the frequency: ");
        while (q-- > 0) {
            char c = input.next().charAt(0);
            System.out.println(map.getOrDefault(c, 0));
        }
    }
}
