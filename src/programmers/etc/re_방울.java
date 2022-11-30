package programmers.etc;

public class re_방울 {
    public static void main(String[] args) {
        int[] b1 = new int[] {1,2,1,1,1,2,2,1},
                b2 = new int[] {1,1,1,1,1,1},
                b3 = new int[] {2,2,1,1,2,2,2,2,2,2,1};
        System.err.println(solution(b1));
        System.err.println(solution(b2));
        System.err.println(solution(b3));
    }

    public static int solution(int[] bell) {
        var maxSize = bell.length;

        for (int i = maxSize; i > 0 ; i--) {
           // 7일경우
            var start = 0;
            var end = i -1;

            while(start >= 0 && end < maxSize) {
                if (check(start, end, bell)) return i;

                start++;
                end++;
            }
        }

        return 0;
    }

    public static boolean check(int start, int end, int[] bell) {
        var count = 0;
        for (int i = start; i <= end; i++) {
            count += bell[i] == 1 ? 1 : -1;
        }

        return count == 0;
    }
}
