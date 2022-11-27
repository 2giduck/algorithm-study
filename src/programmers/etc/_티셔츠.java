package programmers.etc;

import java.util.Arrays;

public class _티셔츠 {
    public static void main(String[] args) {
        int[] p1 = new int[] {2, 3},
                p2 = new int[] {1,2,3};
        int[] t1 = new int[] {1,2,3},
                t2 = new int[] {1,1};
        System.err.println(solution(p1, t1));
        System.err.println(solution(p2, t2));
    }

    public static int solution(int[] people, int[] tshirts) {
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int pCount = 0, tCount = 0;
        int answer = 0;

        while(pCount<people.length && tCount<tshirts.length) {
            var p = people[pCount];

            boolean find = false;
            while(tCount < tshirts.length) {
                if(tshirts[tCount++] >= p) {
                    answer++;
                    pCount++;
                    find = true;
                    break;
                }
            }

            if(!find) break;
        }

        return answer;
    }
}
