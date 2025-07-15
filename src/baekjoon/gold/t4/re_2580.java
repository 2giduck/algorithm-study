package baekjoon.gold.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class re_2580 {

    static int[][] sdoku;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        sdoku = new int[9][9];
        queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st;

        for(int i = 0; i<9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<9; j++) {
                sdoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }
}
