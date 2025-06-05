package baekjoon.bronze.t3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int afterM = m - 45;
        int afterH = h;
        boolean minusFlag = false;
        if(afterM < 0) {
            minusFlag = true;
            afterM = 60 - (afterM * -1);
        }

        if(minusFlag) {
            afterH-=1;
            if(afterH < 0) {
                afterH = 24 - (afterH * -1);
            }
        }

        System.out.println(afterH + " " + afterM);
    }
}
