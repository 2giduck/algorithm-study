package baekjoon.gold.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class re_18428 {

    static int n;
    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        arr = new String[n][n];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++) {
                arr[i][j] = st.nextToken();
            }
        }
    }
}
