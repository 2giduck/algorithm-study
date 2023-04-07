package programmers.level1;

public class _덧칠하기 {
    public static void main(String[] args) {
        System.err.println(solution(8, 4, new int[]{2, 3, 6}));
        System.err.println(solution(5, 4, new int[]{1, 3}));
        System.err.println(solution(4, 1, new int[]{1, 2, 3, 4}));
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int max = 0;

        for(int i = 0 ; i<section.length; i++) {
            if(section[i] < max) continue;

            answer += 1;
            max = section[i] + m;
        }

        return answer;
    }
}
