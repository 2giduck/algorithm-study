package programmers.level2;

import java.util.HashMap;
import java.util.HashSet;

public class _롤케이크_자르기 {
    public static void main(String[] args) {
        int[] t1 = {1, 2, 1, 3, 1, 4, 1, 2},
                t2 = {1, 2, 3, 1, 4};
        System.err.println(solution(t1));
        System.err.println(solution(t2));
    }
    public static int solution(int[] topping) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int t : topping) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int t : topping) {
            map.put(t, map.get(t)-1);
            if(map.get(t) == 0) {
                map.remove(t);
            }
            set.add(t);
            if(set.size() == map.keySet().size()) {
                answer++;
            }
        }

        return answer;
    }
}
