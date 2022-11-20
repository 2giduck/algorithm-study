package programmers.etc;

import java.util.Arrays;

public class 숫자_게임 {
    public static void main(String[] args) {
        int[] a1 = new int[] {5,1,3,7},
                a2 = new int[] {2,2,2,2};
        int[] b1 = new int[] {2,2,6,8},
                b2 = new int[] {1,1,1,1};

        System.err.println(solution(a1, b1));
        System.err.println(solution(a2, b2));
    }

    public static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int a : A) {
            answer += startGame(a, B)? 1 : 0;
        }

        return answer;
    }

    public static boolean startGame(int a, int[] B) {
        int lastIdx = 0;
        for (int i = 0; i < B.length; i++) {
            if(B[i] != -1) lastIdx = i;

            if(B[i] > a) {
                B[i] = -1;
                return true;
            }
            else if(B[i] == a) {
                B[i] = -1;
                return false;
            }
        }
        B[lastIdx] = -1;
        return false;
    }
}
