package programmers.level2;

public class _모음_사전 {
    public int solution(String word) {
        int[] dx = {781,156,31,6,1};
        String w = "AEIOU";
        int answer = word.length();
        for (int i = 0; i < word.length(); i++) {
            var idx = w.indexOf(word.charAt(i));
            answer += dx[i] * idx;
        }

        return answer;
    }
}
