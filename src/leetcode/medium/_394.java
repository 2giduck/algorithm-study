package leetcode.medium;

import java.util.*;

public class _394 {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } else if (ch == '[') {
                countStack.addLast(k);
                stringStack.addLast(curr);
                curr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder prev = stringStack.removeLast();
                int repeat = countStack.removeLast();
                for (int i = 0; i < repeat; i++) {
                    prev.append(curr);
                }
                curr = prev;
            } else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
