package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/maximum-subarray/
 * 
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int[] result = new int[nums.length];
		int max = nums[0];
		result[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result[i] = Math.max(result[i - 1] + nums[i], nums[i]);
			max = Math.max(result[i], max);
		}
		return max;
	}

}
