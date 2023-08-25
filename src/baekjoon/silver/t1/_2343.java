package baekjoon.silver.t1;

import java.util.Arrays;
import java.util.Scanner;

public class _2343 {
    static int M;
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int l = Arrays.stream(A).max().getAsInt();
        int r = Arrays.stream(A).sum();
        int answer = r;
        while(l <= r) {
            int m = (l + r)/2;
            if(check(m)) {
                answer = Math.min(answer, m);
                r = m - 1;
            }else {
                l = m + 1;
            }
        }

        System.out.println(answer);
    }

    public static boolean check(int m) {
        int count = 0;
        int sum = 0;
        for(int a : A) {
            if(sum + a > m) {
                sum = 0;
                count++;
            }
            sum += a;
        }
        if(sum!= 0) count++;

        return count <= M;
    }
}
