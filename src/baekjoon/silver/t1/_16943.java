package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16943 {

    static char[] arr;
    static int length;
    static long max;
    static boolean[] visit;
    static long b;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        b = Long.parseLong(st.nextToken());

        arr = new char[a.length()];
        visit = new boolean[a.length()];
        for(int i = 0; i<a.length(); i++) {
            arr[i] = a.charAt(i);
        }
        length = a.length();
        max = -1;

        backtracking("", 0);
        System.out.println(max);
    }

    private static void backtracking(String value, int depth) {
        if(length == depth) {
            var v = Long.parseLong(value);
            if(v > b) return;
            max = Math.max(max, Long.parseLong(value));
            return;
        }

        for(int i = 0; i<length; i++) {
            if(visit[i]) continue;
            if(depth == 1 && value.charAt(0) == '0') continue;
            visit[i] = true;
            backtracking(value + arr[i], depth + 1);
            visit[i] = false;
        }
    }
}
