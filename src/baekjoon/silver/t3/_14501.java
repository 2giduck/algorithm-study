package baekjoon.silver.t3;

import java.util.Scanner;

public class _14501 {
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

        int[] dy = new int[N+2];
        //dy[i] = i부터 N일까지 상담을 진행했을 때 얻을 수 있는 최대 이익

        for(int i = N; i>=1; i--) {
            if(arr[i][0] + i > N+1) {
                //상담 진행 못함
                dy[i] = dy[i+1];
            }else {
                dy[i] = Math.max(dy[i+1], dy[i + arr[i][0]] + arr[i][1]);
            }
        }

        System.out.println(dy[1]);
    }
}
