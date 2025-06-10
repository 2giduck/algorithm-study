package baekjoon.silver.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14888 {

    static int[] arr;
    static int[] op; //
    static int max;
    static int min;// 0:+, 1:-, 2:x, 3:/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        op = new int[4];
        for(int i = 0; i< 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        backtracking(1, arr[0], op[0], op[1], op[2], op[3]);;
        System.out.println(max);
        System.out.println(min);
    }

    private static void backtracking(int idx, int curValue, int plus, int minus, int mul, int div) {
        if(idx == arr.length) {
            max = Math.max(curValue, max);
            min = Math.min(curValue, min);
            return;
        }

        if (plus > 0) backtracking(idx+1, curValue+arr[idx], plus-1, minus, mul, div);
        if (minus > 0) backtracking(idx+1, curValue-arr[idx], plus, minus-1, mul, div);
        if (mul > 0) backtracking(idx+1, curValue*arr[idx], plus, minus, mul-1, div);
        if (div > 0) backtracking(idx+1, curValue/arr[idx], plus, minus, mul, div-1);
    }
}
