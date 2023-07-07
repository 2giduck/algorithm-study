package baekjoon.silver.t3;

import java.util.Scanner;

public class re2_14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1][2];
        for (int i = 1; i <= N ; i++) {
            int t = sc.nextInt();
            int p = sc.nextInt();
            arr[i][0] = t;
            arr[i][1] = p;
        }
    }
}
