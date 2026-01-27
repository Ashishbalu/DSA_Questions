package DSA_Que;

public class PalindromeUsingRec {
    static boolean palindrome(int i, String s){
        int n = s.length();
        if (i>=n/2){
            return true;
        }
        if (s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return palindrome(i+1, s);
    }

    public static void main(String[] args) {
        String s = "MadaM";

        //normalize for case-insensitive check
        s = s.toLowerCase();
        System.out.println(palindrome(0, s));
    }
}
