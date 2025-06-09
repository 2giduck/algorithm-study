package baekjoon.bronze.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2490 {

    static int zeroCount = 0;
    static int oneCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<3; i++) {
            zeroCount = 0;
            oneCount = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            count(a);
            count(b);
            count(c);
            count(d);

            if(zeroCount == 1) {
                sb.append("A");
            }else if(zeroCount == 2) {
                sb.append("B");
            }else if(zeroCount == 3) {
                sb.append("C");
            }else if(zeroCount == 4) {
                sb.append("D");
            }else {
                sb.append("E");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void count(int n) {
        if(n == 0) zeroCount++;
        else oneCount++;
    }
}
