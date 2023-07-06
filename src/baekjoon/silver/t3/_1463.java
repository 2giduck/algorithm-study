package baekjoon.silver.t3;

import java.util.Scanner;

public class _1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dy = new int[N+1];
        // dy[i] = i가 1이 될 때까지의 최소 횟수
        dy[1] = 0;

        for (int i = 2; i <= N ; i++) {
            dy[i] = dy[i-1] + 1;
            if(i % 2 == 0) {
                dy[i] = Math.min(dy[i/2]+1, dy[i]);
            }
            if(i % 3 == 0) {
                dy[i] = Math.min(dy[i/3]+1, dy[i]);
            }
        }
        System.out.println(dy[N]);
    }
}
