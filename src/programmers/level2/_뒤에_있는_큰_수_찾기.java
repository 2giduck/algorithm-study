package programmers.level2;

import java.util.Arrays;
import java.util.Stack;

public class _뒤에_있는_큰_수_찾기 {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 3, 5},
                n2 = {9, 1, 5, 3, 6, 2};
        System.err.println(Arrays.toString(solution(n1)));
        System.err.println(Arrays.toString(solution(n2)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = numbers.length-1; i >= 0; i--) {
            if(stack.isEmpty()) {
                answer[i] = -1;
            }else {
                while(!stack.isEmpty()) {
                    if(stack.peek() <= numbers[i]) {
                        stack.pop();
                    }else {
                        answer[i] = stack.peek();
                        break;
                    }
                }
                if(answer[i] == 0) answer[i] = -1;
            }
            stack.push(numbers[i]);
        }

        return answer;
    }
}
