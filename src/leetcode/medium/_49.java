package leetcode.medium;

import java.util.*;

public class _49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            List<String> values = map.getOrDefault(sortedString, new ArrayList<>());
            values.add(str);
            map.put(sortedString, values);
        }

        List<List<String>> answer = new ArrayList<>();
        for(List<String> value : map.values()) {
            answer.add(value);
        }

        return answer;
    }
}
