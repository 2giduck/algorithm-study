package programmers.level2;

import java.util.HashMap;

public class _할인_행사 {
    public static void main(String[] args) {
        String[] w1 = {"banana", "apple", "rice", "pork", "pot"},
                w2 = {"apple"};
        int[] n1 = {3, 2, 2, 2, 1},
                n2 = {10};
        String[] d1 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"},
                d2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        System.err.println(solution(w1, n1, d1));
        System.err.println(solution(w2, n2, d2));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        int answer = 0;
        // 첫 번째 날 구하기
        for (int i = 0; i < 10; i++) {
            if(map.containsKey(discount[i])){
                map.put(discount[i], map.get(discount[i])-1);
            }
        }
        if(isOk(map)) answer++;

        for (int i = 1; i < discount.length-9; i++) {
            int start = i;
            int end = start+9;

            if(map.containsKey(discount[start-1])) {
                map.put(discount[start-1], map.get(discount[start-1])+1);
            }
            if(map.containsKey(discount[end])) {
                map.put(discount[end], map.get(discount[end])-1);
            }
            if(isOk(map)) answer++;
        }

        return answer;
    }

    public static boolean isOk(HashMap<String, Integer> map) {
        return map.values().stream()
                .allMatch(s -> s<=0);
    }
}
