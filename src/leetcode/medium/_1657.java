package leetcode.medium;

import java.util.*;

public class _1657 {

    public boolean closeStrings(String word1, String word2) {
        // 1. 순서 바꿔도 됨
        // 2. 빈도수 같아야 함
        Map<Character, Integer> wordMap1 = new HashMap<>();
        Map<Character, Integer> wordMap2 = new HashMap<>();

        if(word1.length() != word2.length()) return false;

        for(char str : word1.toCharArray()) {
            wordMap1.put(str, wordMap1.getOrDefault(str, 0) + 1);
        }
        for(char str : word2.toCharArray()) {
            wordMap2.put(str, wordMap2.getOrDefault(str, 0) + 1);
        }

        for(Character word: wordMap1.keySet()) {
            if(!wordMap2.containsKey(word)) return false;
        }

        List<Integer> values2 = new ArrayList<>(wordMap2.values());
        for(Integer value: wordMap1.values()) {
            if(!values2.contains(value)) return false;
            values2.remove(value);
        }


        return true;
    }
}
