package programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class _1차_캐시 {
    static int globalSize;

    public static void main(String[] args) {
        int c1 = 3, c2 = 3, c3 = 2, c4 = 5, c5 = 2, c6 = 0;
        String[] t1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"},
                t2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"},
                t3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                t4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"},
                t5 = {"Jeju", "Pangyo", "NewYork", "newyork"},
                t6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        System.err.println(solution(c1, t1));
//        System.err.println(solution(c2, t2));
//        System.err.println(solution(c3, t3));
//        System.err.println(solution(c4, t4));
        System.err.println(solution(c5, t5));
//        System.err.println(solution(c6, t6));
    }

    public static int solution(int cacheSize, String[] cities) {
        globalSize = cacheSize;

        int answer = 0;
        Cache cache = new Cache();
        for(String city : cities) {
            answer += cache.getTimes(city.toLowerCase());
        }

        return answer;
    }

    static class Cache {
        Queue<String> cities = new LinkedList<>();

        public int getTimes(String find) {
            int time;
            if(cities.contains(find)) {
                time = 1;
                cities.remove(find);
                cities.add(find);
            } else {
                time = 5;
                addCity(find);
            }
            addCity(find);
            return time;
        }

        public void addCity(String city) {
            if(globalSize == 0) return;

            if(cities.size() < globalSize) {
                cities.add(city);
            }else {
                cities.poll();
                cities.add(city);
            }
        }
    }
}
