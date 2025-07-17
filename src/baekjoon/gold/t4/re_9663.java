package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;

public class re_9663 {

    static int n;
    static int[][] board;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

//        backtrack(0);

        System.out.println(answer);
    }
}
