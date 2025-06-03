package baekjoon.bronze.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _18406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        if(canUseLuckyStraight(N)) {
            System.out.println("LUCKY");
        }else {
            System.out.println("READY");
        }
    }

    private static boolean canUseLuckyStraight(String n) {
        char[] chars = n.toCharArray();
        int length = chars.length;
        int base = length/2;

        int a=0, b = 0;

        for(int i = 0 ; i < base ; i++) {
            a+=chars[i];
        }
        for(int i = base; i<length ; i++ ) {
            b+=chars[i];
        }

        return a == b;
    }
}
