package programmers.etc;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int[] b = new int[] {120, 110, 140, 150};

        System.err.println(solution(b, 485));
    }

    public static int solution(int[] budgets, int M) {
        int answer = 0;
        int l = 1, r = Arrays.stream(budgets).max().getAsInt();

        while(l <= r) {
            int mid = (l + r) / 2;

            if(checkPossible(budgets, M, mid)) {
                answer = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }

        return answer;
    }

    // 설정된 예산이 실현 가능한지 보기
    public static boolean checkPossible(int[] budgets, int M, int money) {
        int sum = 0;
        for (int budget : budgets) {
            sum += Math.min(budget, money);
        }

        return sum <= M;
    }
}
