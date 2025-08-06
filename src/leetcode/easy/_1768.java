package leetcode.easy;

public class _1768 {

    public String mergeAlternately(String word1, String word2) {
        // 시간복잡도 O(a + b)

        int size = Math.min(word1.length(), word2.length()) * 2;
        int word1Idx = 0;
        int word2Idx = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<size; i++) {
            if(word1Idx > word2Idx) {
                sb.append(word2.charAt(word2Idx++));
            }else {
                sb.append(word1.charAt(word1Idx++));
            }
        }


        for(int i = word1Idx; i < word1.length(); i++) {
            sb.append(word1.charAt(word1Idx++));
        }
        for(int i = word2Idx; i < word2.length(); i++) {
            sb.append(word2.charAt(word2Idx++));
        }


        return sb.toString();
    }
}
