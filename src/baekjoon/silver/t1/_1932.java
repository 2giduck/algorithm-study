package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1932 {

    public static void main(String[] args) throws IOException {
        /**
         * 5
         * 7
         * 3 8
         * 8 1 0
         * 2 7 4 4
         * 4 5 2 6 5
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] dp = new int[n][n];
        dp[0][0] = arr[0][0];
        // dp[x][y] = Max(dp[x-1][y-1], dp[x-1][y]) + arr[x][y]
        for(int i = 1; i<n; i++) {
            for(int j = 0; j<=i; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            max = Math.max(max, dp[n-1][i]);
        }
        System.out.println(max);
    }
}
