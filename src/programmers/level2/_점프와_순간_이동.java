package programmers.level2;

public class _점프와_순간_이동 {
    public static void main(String[] args) {
        int n1 = 5, n2 = 6, n3 = 5000;
        System.err.println(solution(n1));
        System.err.println(solution(n2));
        System.err.println(solution(n3));
    }

    public static int solution(int n) {
        int answer = 1;
        while(n != 1) {
            if(n %2 == 0) {

            }else {
                answer++;
                n--;
            }
            n = n/2;
        }

        return answer;
    }
}
