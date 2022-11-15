package leetcode.easy;

import java.util.HashMap;

public class _409 {

    public static void main(String[] args) {
        String s1 = "abccccdd", s2 = "a", s3 = "ccc";
        System.err.println(longestPalindrome(s1));
        System.err.println(longestPalindrome(s2));
        System.err.println(longestPalindrome(s3));
    }

    public static int longestPalindrome(String s) {
        var map = new HashMap<Character, Integer>();

        for(char str: s.toCharArray()) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        var answer = 0;
        var odd = false;
        for(int sss : map.values()) {
            answer += sss % 2 == 0 ? sss : sss-1;
            if(sss % 2 == 1) odd = true;
        }


        return odd ? answer +1 : answer;
    }
}
