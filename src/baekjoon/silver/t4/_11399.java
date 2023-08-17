package baekjoon.silver.t4;

import java.util.Arrays;
import java.util.Scanner;

public class _11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int sum = 0;
        int val = 0;
        for(int i = 0; i<N; i++) {
            sum += val + p[i];
            val = val + p[i];
        }// 1 2 3 3 4

        System.out.println(sum);
    }
}
