package programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class _가장_큰_수 {
    public static void main(String[] args) {
        System.err.println(solution(new int[]{6, 10, 2}));
        System.err.println(solution(new int[]{3, 30, 34, 5, 9}));
    }

    public static String solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;

                return s2.compareTo(s1);
            }
        });

        StringBuilder answer = new StringBuilder();

        if(list.get(0) == 0) return "0";

        for(int i : list) {
            answer.append(i);
        }
        return answer.toString();
    }
}
