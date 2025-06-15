package baekjoon.silver.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2980 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[][] arr = new int[l+1][2];
        for(int i = 0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            arr[d][0] = Integer.parseInt(st.nextToken());
            arr[d][1] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int curr = 0;
        while(curr < l) {
            result++;
            curr++;

            if(arr[curr][0] != 0) { // 신호등이 있다면
                var t = arr[curr][0] + arr[curr][1];
                var cycle = result % t;
                if(cycle < arr[curr][0]) {
                    var wait = arr[curr][0] - cycle;
                    result += wait;
                }
            }
        }

        System.out.println(result);
    }
}
