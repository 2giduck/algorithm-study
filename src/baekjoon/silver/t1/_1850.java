package baekjoon.silver.t1;

import java.util.Scanner;

public class _1850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long num = gcd(a, b);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< num ; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else
            return gcd(b, a % b);
    }
}
