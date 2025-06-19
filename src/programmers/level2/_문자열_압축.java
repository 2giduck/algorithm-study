package programmers.level2;

public class _문자열_압축 {

    public static void main(String[] args) {
        System.err.println(solution("aabbaccc"));
        System.err.println(solution("ababcdcdababcdcd"));
        System.err.println(solution("abcabcdede"));
        System.err.println(solution("abcabcabcabcdededededede"));
        System.err.println(solution("xababcdcdababcdcd"));
    }

    public static int solution(String s) {
        int length = s.length();
        int half = length / 2;

        int answer = s.length();
        for(int i = 1; i<=half + 1; i++) {
            answer = Math.min(answer, press(s, i));
        }

        return answer;
    }

    public static int press(String s, int k) {
        int length = s.length();
        var prev = s.substring(0, k);
        int idx = k;
        String newStr = "";
        int count = 1;
        while(idx+k <= length) {
            var curr = s.substring(idx, idx + k);
            if (prev.equals(curr)) {
                count++;
            }else {
                newStr += count == 1 ? prev : count + prev;
                prev = curr;
                count = 1;
            }
            idx+=k;
        }
        newStr += count == 1 ? prev : count + prev;

        if(idx < length) {
            newStr += s.substring(idx);
        }

        return newStr.length();
    }
}
