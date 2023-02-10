package programmers.level1;

public class _기사단원의_무기 {
    public static void main(String[] args) {
        int n1 = 5, l1 = 3, p1 = 2;
        int n2 = 10, l2 = 3, p2 = 2;
        System.err.println(solution(n1, l1, p1));
        System.err.println(solution(n2, l2, p2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1 ; i<=number; i++) {
            var num = getNumber(i);
            answer += num > limit ? power : num;
        }

        return answer;
    }

    private static int getNumber(int num) {
        int cnt = 0;

        for(int i = 1; i * i <= num ; i++) {
            if(i * i == num) cnt++;
            else if(num % i == 0) cnt+=2;
        }

        return cnt;
    }
}
