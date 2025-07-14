package programmers.level3;

public class re_자물쇠와_열쇠 {

    public static void main(String[] args) {
        int[][] key = {{0,0,0}, {1,0,0}, {0,1,1}};
        int[][] lock = {{1,1,1}, {1,1,0}, {1,0,1}};

        System.err.println(solution(key, lock));
    }

    static public boolean solution(int[][] key, int[][] lock) {
        boolean answer = true;
        return answer;
    }
}
