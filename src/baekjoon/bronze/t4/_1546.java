package baekjoon.bronze.t4;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        int max = -1;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
            max = Math.max(max, A[i]);
        }

        var result = ((double)sum * 100) / (double)(max * N);
        System.out.println(result);
    }
}
