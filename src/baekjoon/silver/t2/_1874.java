package baekjoon.silver.t2;

import java.util.*;

public class _1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int currentNum = 1;
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while(idx < n) {
            if(stack.isEmpty()) {
                stack.push(currentNum++);
                sb.append("+").append("\n");
            }

            var num = stack.peek();
            if(num == arr[idx]) {
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }
            else if(num > arr[idx]){
                break;
            }else{
                sb.append("+").append("\n");
                stack.push(currentNum++);
            }
        }

        if(idx == n) {
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }
    }
}
