package programmers.etc;

import java.util.Arrays;

public class 부서예산 {
    public static void main(String[] args) {
        int[] d1 = new int[] {1,3,2,5,4},
                d2 = new int[] {2,2,3,3};
        int b1 = 9, b2 = 10;
        System.err.println(solution(d1, b1));
        System.err.println(solution(d2, b2));
    }

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);

        int sum = 0;
        int answer = 0;
        for (int dev : d) {
            if(dev + sum > budget) break;

            sum += dev;
            answer++;
        }

        return answer;
    }
}
