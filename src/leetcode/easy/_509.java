package leetcode.easy;

public class _509 {
    public static void main(String[] args) {
        int n1 = 2, n2 = 3, n3 = 4;
        System.err.println(fib(n1));
        System.err.println(fib(n2));
        System.err.println(fib(n3));
    }

    public static int fib(int n) {
        int[] fib = new int[n+1];

        fib[0] = 0;
        if(n == 0) return fib[0];

        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        return fib[n];
    }
}
