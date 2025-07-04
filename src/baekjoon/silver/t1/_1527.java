package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _1527 {

    static long a;
    static long b;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        count = 0;
        backtracking("");

        System.out.println(count);
    }

    private static void backtracking(String t) {
        if(!t.isEmpty()) {
            long val = Long.parseLong(t);
            if(val > b) return;
            if(val >= a) count++;
        }

        backtracking(t+ "4");
        backtracking(t + "7");
    }
}
