package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14889 {

    static int limit;
    static int answer;
    static int sum;
    static int n;
    static int[][] arr;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new int[n][n];
        sum = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum+=arr[i][j];
            }
        }

        limit = n/2;
        selected = new boolean[n];
        answer = Integer.MAX_VALUE;
        backtrack(0, 0);

        System.out.println(answer);
    }

    private static void backtrack(int depth, int idx) {
        if(limit == depth) {
            var tmp = calculate();
            answer = Math.min(answer, tmp);
            return;
        }

        for(int i = idx; i<n; i++) {
            if(selected[i]) continue;
            selected[i] = true;
            backtrack(depth+1, i+1);
            selected[i] = false;
        }

    }

    private static int calculate() {
        int start = 0;
        int link = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(i == j) continue;

                if(selected[i] && selected[j]) {
                    start += arr[i][j] + arr[j][i];
                }else if(!selected[i] && !selected[j]) {
                    link += arr[i][j] + arr[j][i];
                }
            }
        }

        return Math.abs(start -link);
    }
}
