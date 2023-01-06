package leetcode.easy;

import java.util.HashMap;

public class re_242 {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "rat";
        String t1 = "nagaram", t2 = "car";
        System.err.println(isAnagram(s1, t1));
        System.err.println(isAnagram(s2, t2));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] nums = new int[26];

        for(int i=0 ; i<s.length(); i++) {
            nums[(int)s.charAt(i) - 'a']++;
            nums[(int)t.charAt(i) - 'a']--;
        }

        for(int num : nums) {
            if(num != 0) return false;
        }

        return true;
    }
}
