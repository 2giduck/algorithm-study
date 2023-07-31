package baekjoon.bronze.t1;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] dy = new int[k+1][n+1];
            for(int i = 1; i<=n ; i++) {
                dy[0][i] = i;
            }

            for(int i = 1; i<=k ; i++) {
                for(int j = 1; j<=n ; j++) {
                    dy[i][j] = dy[i][j-1] + dy[i-1][j];
                }
            }
            sb.append(dy[k][n]).append("\n");
        }
        System.out.println(sb);
    }


}
