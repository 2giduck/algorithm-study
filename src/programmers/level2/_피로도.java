package programmers.level2;

public class _피로도{
    static boolean[] visit;
    static int answer;

    public void search(int depth, int k, int[][] d) {
        for(int i = 0; i<d.length; i++) {
            if(!visit[i] && d[i][0] <= k ) {
                visit[i] = true;
                search(depth + 1, k - d[i][1], d);
                visit[i] = false;
            }
        }

        answer = Math.max(depth, answer);
    }


    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        answer = 0;

        search(0, k, dungeons);


        return answer;
    }
}
