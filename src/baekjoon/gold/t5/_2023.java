package baekjoon.gold.t5;

import java.util.Scanner;

public class _2023 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int number, int zarisu) {
        if(!isPrime(number)) return;

        if(zarisu == n) {
            System.out.println(number);
        }else {
            for (int i = 0; i <= 9 ; i++) {
                DFS(number*10 + i, zarisu+1);
            }
        }
    }

    static boolean isPrime(int num) {
        for(int i = 2; i<=num/2; i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
