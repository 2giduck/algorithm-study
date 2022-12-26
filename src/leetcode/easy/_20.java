package leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class _20 {
    public static void main(String[] args) {
        String s1 = "()", s2 = "()[]{}", s3 = "(]";
        System.err.println(isValid(s1));
        System.err.println(isValid(s2));
        System.err.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> queue = new Stack<>();

        for(char str : s.toCharArray()) {
            if(map.containsKey(str)) {
                queue.push(map.get(str));
            } else {
                if(queue.isEmpty()) return false;
                if(queue.pop() != str) return false;
            }
        }
        return queue.isEmpty();
    }
}
