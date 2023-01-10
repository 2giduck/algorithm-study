package leetcode.medium;

import java.util.HashSet;

public class _3 {

    public static void main(String[] args) {
        String s1 = "abcabcbb", s2 = "bbbbb", s3 = "pwwkew";
        System.err.println(lengthOfLongestSubstring(s1));
        System.err.println(lengthOfLongestSubstring(s2));
        System.err.println(lengthOfLongestSubstring(s3));
    }

    public static int lengthOfLongestSubstring(String s) {

        int answer = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            var count = 0;
            for (int j = i ; j < s.length(); j++) {
                var temp = s.charAt(j);
                if(set.contains(temp)) break;
                count++;
                set.add(temp);
            }
            answer = Math.max(answer, count);
            set.clear();
        }

        return answer;
    }
}
