package programmers.level1;

import java.util.*;

public class _신고_결과_받기 {
    public static void main(String[] args) {
        String[] i1 = {"muzi", "frodo", "apeach", "neo"},
                i2 = {"con", "ryan"};
        String[] r1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
                r2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k1 = 2, k2 = 3;
        System.err.println(Arrays.toString(solution(i1, r1, k1)));
        System.err.println(Arrays.toString(solution(i2, r2, k2)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (String r: report) {
            var temp = r.split(" ");
            var a = temp[0];
            var b = temp[1];

            var ss = map.getOrDefault(a, new ArrayList<>());
            if(ss.contains(b)) continue;
            ss.add(b);
            map2.put(b, map2.getOrDefault(b, 0) +1);
            if(map2.get(b) == k) set.add(b);
            map.put(a, ss);
        }

        int[] answer = new int[id_list.length];

        int idx = 0;
        for(String id: id_list) {
            var temp = map.getOrDefault(id, new ArrayList<>());
            answer[idx++] = (int) temp.stream().filter(set::contains).count();
        }
        return answer;
    }
}
