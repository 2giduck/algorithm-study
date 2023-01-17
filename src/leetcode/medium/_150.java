package leetcode.medium;

import java.util.Stack;

public class _150 {

    public static void main(String[] args) {
        String[] t1 = {"2","1","+","3","*"},
                t2 = {"4","13","5","/","+"},
                t3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.err.println(evalRPN(t1));
        System.err.println(evalRPN(t2));
        System.err.println(evalRPN(t3));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(String token : tokens) {
            switch(token) {
                case "+":
                    var a = Integer.parseInt(stack.pop());
                    var b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b + a));
                    break;
                case "-":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b - a));
                    break;
                case "*":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b * a));
                    break;
                case "/":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b / a));
                    break;
                default:
                    stack.push(token);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
