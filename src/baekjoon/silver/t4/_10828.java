package baekjoon.silver.t4;

import java.io.IOException;
import java.util.Scanner;

public class _10828 {
    static StringBuilder sb;
    static int[] stack;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        stack = new int[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.next();

            switch(str) {
                case "push":
                    int a = sc.nextInt();
                    stack[idx++] = a;
                    break;
                case "pop":
                    if(idx == 0) {
                        System.out.println(-1);
                    }else {
                        System.out.println(stack[idx-1]);
                        idx--;
                    }
                    break;
                case "size":
                    System.out.println(idx);
                    break;
                case "empty":
                    if(idx ==0) {
                        System.out.println(1);
                    }else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(idx == 0) {
                        System.out.println(-1);
                    }else {
                        System.out.println(stack[idx-1]);
                    }
                    break;
            }
        }

    }
}
