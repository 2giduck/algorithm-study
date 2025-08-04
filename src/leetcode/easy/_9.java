package leetcode.easy;

public class _9 {
    public boolean isPalindrome(int x) {

        String str = String.valueOf(x);

        for(int i = 0; i < str.length(); i++) {
            var right = str.length() - i - 1;
            if(right <= i) break;
            if(str.charAt(i) != str.charAt(right)) return false;
        }

        return true;
    }
}
