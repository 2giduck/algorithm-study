package leetcode.easy;

import java.util.Stack;

public class _844 {
    public static void main(String[] args) {
        String s1 = "ab#c", s2 = "ab##", s3 = "a#c";
        String t1 = "ad#c", t2 = "c#d#", t3 = "b";
        System.err.println(backspaceCompare(s1, t1));
        System.err.println(backspaceCompare(s2, t2));
        System.err.println(backspaceCompare(s3, t3));
    }

    public static boolean backspaceCompare(String s, String t) {
        return getNewString(s).equals(getNewString(t));
    }

    public static String getNewString(String s) {
        Stack<Character> stack = new Stack<>();

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                count +=1;
            }else {
                if(count > 0) {
                    count -=1;
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }

        String newString = "";
        while(!stack.isEmpty()) {
            newString += stack.pop();
        }

        return newString;
    }
}
