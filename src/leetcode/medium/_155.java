package leetcode.medium;

import java.util.ArrayList;

public class _155 {
    class MinStack {

        private int min;
        private ArrayList<Integer> list;

        public MinStack() {
            list = new ArrayList<>();
            min = Integer.MAX_VALUE;
        }

        public void push(int val) {
            list.add(val);
            min = Math.min(val, min);
        }

        public void pop() {
            var temp = top();
            list.remove(list.size() -1);

            if(temp == min) {
                min = Integer.MAX_VALUE;
                for(int a : list) {
                    min = Math.min(a, min);
                }
            }
        }

        public int top() {
            return list.get(list.size() -1);
        }

        public int getMin() {
            return min;
        }
    }
}
