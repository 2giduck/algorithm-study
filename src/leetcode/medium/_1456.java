package leetcode.medium;

import java.util.List;

public class _1456 {

    static List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

    public int maxVowels(String s, int k) {

        char[] charArr = s.toCharArray();
        int count = 0;
        for(int i = 0; i<k; i++) {
            if(vowels.contains(charArr[i])) {
                count++;
            }
        }

        int answer = count;
        int curCount = count;
        for(int i = 1; i<charArr.length - k + 1; i++) {
            if(vowels.contains(charArr[i - 1])) curCount--;
            if(vowels.contains(charArr[i + k -1])) curCount++;
            answer = Math.max(answer, curCount);
        }

        return answer;
    }
}
