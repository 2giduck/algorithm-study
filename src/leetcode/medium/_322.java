package leetcode.medium;

import java.util.HashSet;

public class _322 {
    public static void main(String[] args) {
        int[] c1 = {1, 2, 5}, c2 = {2}, c3 = {1};
        int a1 = 11, a2 = 3, a3 = 0;
        System.err.println(coinChange(c1, a1));
        System.err.println(coinChange(c2, a2));
        System.err.println(coinChange(c3, a3));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dy = new int[amount+1];
        dy[0] = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int coin: coins) {
            set.add(coin);
        }

        for (int i = 1; i <= amount ; i++) {
            var min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                var temp = i - coins[j];
                if(set.contains(temp)) {
                    min = Math.min(min, dy[temp] + 1);
                    set.add(i);
                }
            }
            dy[i] = min;
        }

        return dy[amount] == Integer.MAX_VALUE ? -1 : dy[amount];
    }
}
