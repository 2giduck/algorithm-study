package leetcode.easy;

import java.util.Locale;

public class _125 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama",
                s2 = "race a car",
                s3 = " ";
//        System.err.println(isPalindrome(s1));
//        System.err.println(isPalindrome(s2));
//        System.err.println(isPalindrome(s3));
        String s = "0P";
        System.err.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        var temp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);

        for (int i = 0; i < temp.length(); i++) {
            var a = temp.charAt(i);
            var b = temp.charAt(temp.length()-1 - i);
            if(a != b) return false;
        }

        return true;
    }
}
