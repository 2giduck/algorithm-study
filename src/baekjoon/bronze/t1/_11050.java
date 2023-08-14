package baekjoon.bronze.t1;

import java.util.Scanner;

public class _11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] d = new int[N+1][N+1];
        for(int i = 1; i<=N ; i++) {
            d[i][0] = 1;
            d[i][i] = 1;
            d[i][1] = i;
        }

        for(int i = 2; i<=N; i++) {
            for(int j = 1; j<i; j++) {
                d[i][j] = d[i-1][j] + d[i-1][j-1];
            }
        }

        System.out.println(d[N][K]);
    }
}
