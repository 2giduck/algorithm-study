package programmers.level1;

public class _콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a) {
            answer += (n / a) * b;
            n = (n % a) + (n / a) *b;
        }

        return answer;
    }
}
