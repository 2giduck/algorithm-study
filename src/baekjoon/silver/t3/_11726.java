package baekjoon.silver.t3;

import java.util.Scanner;

public class _11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] dy = new long[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n ; i++) {
            dy[i] = (dy[i-1] + dy[i-2]) % 10007;
        }

        System.out.println(dy[n]);
    }
}
