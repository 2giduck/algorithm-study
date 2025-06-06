package baekjoon.silver.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1003 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        dp = new int[41][41];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            sb.append(dp[a][0]).append(" ").append(dp[a][1]).append("\n");
        }
        System.out.println(sb);
    }
}
