package baekjoon.silver.t3;

import java.util.Scanner;

public class _2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[][] dy = new long[N+1][2];
        dy[1][0] = 0;
        dy[1][1] = 1;

        //dy[i][0] = 뒷자리가 0
        //dy[i][1] = 뒷자리가 1

        for (int i = 2; i <= N ; i++) {
            dy[i][0] = dy[i-1][0] + dy[i-1][1];
            dy[i][1] = dy[i-1][0];
        }

        System.out.println(dy[N][0] + dy[N][1]);
    }
}
