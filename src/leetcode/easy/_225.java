package leetcode.easy;

import java.util.ArrayList;

public class _225 {
    class MyQueue {

        ArrayList<Integer> list;

        public MyQueue() {
            list = new ArrayList<>();
        }

        public void push(int x) {
            list.add(x);
        }

        public int pop() {
            int x = list.get(0);
            list.remove(0);
            return x;
        }

        public int peek() {
            return list.get(0);
        }

        public boolean empty() {
            return list.isEmpty();
        }
    }

}
