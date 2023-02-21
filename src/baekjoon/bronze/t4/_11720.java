package baekjoon.bronze.t4;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        // character로 변환
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(char c : cNum) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
