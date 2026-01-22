package DSA_Que;

public class PallindromeUsingRec {
    static boolean pallindrome(int i, String s){
        int n = s.length();
        if (i>=n/2){
            return true;
        }
        if (s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return pallindrome(i+1, s);
    }

    public static void main(String[] args) {
        String s = "MadaM";

        //normalize for case-insensitive check
        s = s.toLowerCase();
        System.out.println(pallindrome(0, s));
    }
}
