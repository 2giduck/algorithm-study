package programmers.etc;

import java.util.HashSet;

public class re_기지국_설치 {

    public static void main(String[] args) {
        int n1 = 11, n2 = 16;
        int[] s1 = new int[] {4, 11},
                s2 = new int[] {9};
        int w1 = 1, w2 = 2;

        System.err.println(solution(n1, s1, w1));
        System.err.println(solution(n2, s2, w2));
    }


    public static int solution(int n, int[] stations, int w) {
        int answer = 0;

        var stationHashSet = new HashSet<Integer>();
        for (int station: stations) { // 이미 불빛이 밝혀지는 정거장 구하기
            addStation(stationHashSet, station, w);
        }

        for (int i = 1; i <= n; i++) {
            if(stationHashSet.contains(i)) continue;

            if(i + w <= n) {
                addStation(stationHashSet, i + w, w);
            }else {
                addStation(stationHashSet, i, w);
            }
            answer++;
        }
        return answer;
    }

    public static void addStation(HashSet<Integer> stationHashSet, int station, int w) {
        for (int i = station-w; i <= station+w ; i++) {
            stationHashSet.add(i);
        }
    }
}