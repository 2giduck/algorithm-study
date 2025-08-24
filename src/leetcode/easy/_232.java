package leetcode.easy;

import java.util.*;

public class _232 {

    class MyQueue {

        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;

        public MyQueue() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        public void push(int x) {
            inputStack.push(x);
        }

        public int pop() {
            if(!outputStack.isEmpty()) return outputStack.pop();

            while(!inputStack.isEmpty()) {
                var pop = inputStack.pop();
                outputStack.push(pop);
            }

            return outputStack.pop();
        }

        public int peek() {
            if(!outputStack.isEmpty()) return outputStack.peek();

            while(!inputStack.isEmpty()) {
                var pop = inputStack.pop();
                outputStack.push(pop);
            }

            return outputStack.peek();
        }

        public boolean empty() {
            return inputStack.isEmpty() && outputStack.isEmpty();
        }
    }
}
