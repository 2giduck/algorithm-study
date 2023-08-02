package baekjoon.silver.t5;

import java.util.Scanner;

public class re_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] dy = new int[n+1][m+1];

            sb.append(dy[n][m]).append("\n");
        }
        System.out.println(sb);
    }
}
