package baekjoon.silver.t5;

import java.util.Scanner;

public class _1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] arr = N.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            var max = arr[i] - '0';
            int idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] - '0' > max) {
                    max = arr[j] - '0';
                    idx = j;
                }
            }
            var temp = arr[i];
            arr[i] = (char)max;
            arr[idx] = temp;
            sb.append(max);
        }

        System.out.println(sb.toString());
    }
}
