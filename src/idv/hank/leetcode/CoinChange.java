package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/coin-change/
 * 
 */
public class CoinChange {

	public int coinChange(int[] coins, int amount) {
		if (amount < 1) {
			return 0;
		}
		int[] count = new int[amount + 1];
		for (int i = 1; i <= amount; i++) {
			int min = -1;
			for (int coin : coins) {
				if (i >= coin && count[i - coin] != -1) {
					int value = count[i - coin] + 1;
					min = min < 0 ? value : Math.min(min, value);
				}
			}
			count[i] = min;
		}
		return count[amount];
	}

}
