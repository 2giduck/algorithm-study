package programmers.level2;

import java.util.Stack;

public class _짝지어_제거하기 {
    public static void main(String[] args) {
        String s1 = "baabaa",
                s2 = "cdcd";
        System.err.println(solution(s1));
        System.err.println(solution(s2));
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            var tmp = s.charAt(i);

            if(!stack.isEmpty()) {
                var t = stack.pop();
                if(t != tmp) {
                    stack.push(t);
                    stack.push(tmp);
                }
            }else {
                stack.push(tmp);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
