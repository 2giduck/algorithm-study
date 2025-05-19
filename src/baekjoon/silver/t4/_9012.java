package baekjoon.silver.t4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            var isVPS = checkVPS(str);
            if(isVPS) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    //d
    private static boolean checkVPS(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '(') {
                stack.push(c);
            }else {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
