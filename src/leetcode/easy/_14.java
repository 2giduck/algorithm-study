package leetcode.easy;

public class _14 {

    public String longestCommonPrefix(String[] strs) {
        String answer = "";

        for(int i = 0; i <= 200; i++) {
            if(i >= strs[0].length()) break;
            var prefix = strs[0].charAt(i);
            var shouldBreak = false;

            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length()|| prefix != strs[j].charAt(i)) {
                    shouldBreak = true;
                    break;
                }
            }
            if(shouldBreak) break;
            answer += prefix;
        }

        return answer;
    }
}
