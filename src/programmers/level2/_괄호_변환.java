package programmers.level2;

import java.util.Stack;

public class _괄호_변환 {

    public static void main(String[] args) {
        String p1 = "(()())()";
        String p2 = ")(";
        String p3 = "()))((()";
        System.err.println(solution(p1));
        System.err.println(solution(p2));
        System.err.println(solution(p3));

        /**
         * "(()())()"
         * "()"
         * "()(())()"
         */
    }

    public static String solution(String p) {
        if(p.isEmpty()) return p;

        var balanced = splitToBalanced(p);
        var u = balanced[0];
        var v = balanced[1];
        if(isCorrect(u)) {
            return u + solution(v);
        }else {
            return '(' + solution(v) + ')' +
                    reverse(u.substring(1, u.length()-1));
        }
    }

    public static String[] splitToBalanced(String p) {
        var openCount = 0;
        var closeCount = 0;

        for(int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == '(') openCount++;
            else closeCount++;
            if(openCount == closeCount) {
                return new String[] {p.substring(0, i+1), p.substring(i+1)};
            }
        }
        return null;
    }

    private static boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            var tmp = s.charAt(i);
            if(tmp == '(') {
                stack.push(tmp);
            }else if(tmp == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                sb.append(')');
            }else {
                sb.append('(');
            }
        }

        return sb.toString();
    }
}
