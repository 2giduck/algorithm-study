package baekjoon.gold.t4;

import java.util.Scanner;

public class re_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // 사람의 수
        int M = sc.nextInt();   // 파티의 수

        int t = sc.nextInt(); //진실 아는 사람 수
        int[] tArr = new int[t];
        for (int i = 0; i < t; i++) {
            tArr[i] = sc.nextInt();
        }

    }
}
