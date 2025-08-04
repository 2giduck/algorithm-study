package leetcode.medium;

public class _5 {
    public String longestPalindrome(String s) {
        String max = String.valueOf(s.charAt(0));

        for(int i = 0; i<s.length(); i++) {
            for(int j = 0; j<s.length(); j++) {
                int left = i - j;
                int right = i + j;

                if(left < 0 || right >= s.length()) break;
                if(s.charAt(left) != s.charAt(right)) break;

                if(max.length() < right - left + 1) {
                    max = s.substring(left, right+1);
                }
            }
        }

        for(int i = 0; i<s.length() - 1; i++) {
            if(s.charAt(i) != s.charAt(i+1)) continue;

            for(int j = 0; j<s.length()/2; j++) {
                int left = i - j;
                int right = i+1 + j;

                if(left < 0 || right >= s.length()) break;
                if(s.charAt(left) != s.charAt(right)) break;

                if(max.length() < right - left + 1) {
                    max = s.substring(left, right+1);
                }
            }
        }

        return max;
    }
}
