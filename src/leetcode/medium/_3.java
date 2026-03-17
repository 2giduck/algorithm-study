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
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int answer = 1;

        for(int i = 0; i<s.length()-1; i++) {
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j = i+1; j<s.length(); j++) {
                var ch = s.charAt(j);
                if(set.contains(ch)) {
                    break;
                }
                set.add(ch);
            }
            answer = Math.max(answer, set.size());
        }

        return answer;
    }
}
