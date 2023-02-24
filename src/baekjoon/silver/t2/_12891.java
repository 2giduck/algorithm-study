package baekjoon.silver.t2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _12891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var S = sc.nextInt();
        var P = sc.nextInt();
        var dna = sc.next();
        var map = new HashMap<Character, Integer>();
        for (char s : new char[]{'A', 'C', 'G', 'T'}) {
            var count = sc.nextInt();
            map.put(s, count);
        }

        int start = 0, end = P - 1;
        char[] dnaArr = dna.toCharArray();
        var countMap = new HashMap<Character, Integer>();
        for (int i = start; i <= end ; i++) {
            countMap.put(dnaArr[i], countMap.getOrDefault(dnaArr[i], 0) +1);
        }

        var answer = 0;
        while(end < S) {
            if(check(countMap, map)) {
                answer++;
            }
            countMap.put(dnaArr[start], countMap.get(dnaArr[start])-1);
            start++;
            end++;
            if(end == S) break;
            countMap.put(dnaArr[end], countMap.getOrDefault(dnaArr[end], 0)+1);
        }

        System.out.println(answer);
    }

    public static boolean check(Map<Character, Integer> countMap, Map<Character, Integer> map ) {
        for (char s : new char[]{'A', 'C', 'G', 'T'}) {
            if(countMap.getOrDefault(s, 0) < map.get(s)) return false;
        }

        return true;
    }
}
