package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/missing-number/
 * 
 */
public class MissingNumber {

	public int missingNumber(int[] nums) {
		int n = nums.length;
		int total = n * (n + 1) / 2;
		int sum = 0;
		for (int value : nums) {
			sum += value;
		}
		return total - sum;
	}

}
