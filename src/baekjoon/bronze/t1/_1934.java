package baekjoon.bronze.t1;

import java.util.Scanner;

public class _1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(a * b / gcd(a, b)).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if(a == 0 || b == 0) return a;

        return gcd(Math.min(a, b), Math.max(a, b) % Math.min(a, b));
    }
}
