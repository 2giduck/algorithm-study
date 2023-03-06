package baekjoon.silver.t1;

import java.util.Scanner;

public class _1747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(true) {
            if(isPrime(N) && isPalindrome(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    public static boolean isPrime(int num) {
        if(num == 1) return false;
        if(num == 2) return true;
        if(num%2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num) ; i=i+2) {
            if(num % i == 0) return false;
        }

        return true;
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int i = 0, j = str.length() -1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
