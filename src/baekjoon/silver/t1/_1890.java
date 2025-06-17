package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1890 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][n];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        long[][] dp = new long[n][n];
        dp[0][0] = 1;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(arr[i][j] == 0) continue;

                var tmp = arr[i][j];
                if(i+tmp < n) {
                    dp[i+tmp][j] += dp[i][j];
                }
                if(j+tmp < n) {
                    dp[i][j+tmp] += dp[i][j];
                }
            }
        }

        System.out.println(dp[n-1][n-1]);
    }
}
