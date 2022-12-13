package programmers.level1;

public class _삼총사 {
    static int[] number;
    static int[] ans;
    static int answer;
    static boolean[] visit;

    public void backTracking(int depth, int start) {
        if(depth == 3) {
            int sum = 0;
            for(int a : ans) {
                sum += a;
            }

            if(sum == 0) answer++;
        }else {
            for(int i = start ; i < number.length; i++) {
                if(!visit[i]) {
                    visit[i] = true; ans[depth] = number[i];
                    backTracking(depth+1, i+1);
                    visit[i] = false; ans[depth] = -1;
                }
            }
        }
    }

    public int solution(int[] number) {
        this.number = number;
        ans = new int[3];
        answer = 0;
        visit = new boolean[number.length];

        backTracking(0, 0);

        return answer;
    }
}
