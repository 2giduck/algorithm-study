package baekjoon.silver.t1;

import java.util.Scanner;

public class _11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] dy = new int[N+1][N+1];
        for(int i = 1; i<=N; i++) {
            dy[i][0] = 1;
            dy[i][i] = 1;
            dy[i][1] = i;
        }

        for(int i = 2; i<=N; i++) {
            for(int j = 1; j < i; j++) {
                dy[i][j] = (dy[i-1][j] + dy[i-1][j-1])%10007;
            }
        }

        System.out.println(dy[N][K]);
    }
}
