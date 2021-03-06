package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/house-robber/
 *
 */
public class HouseRobber {

	public int rob(int[] nums) {
		return rob(nums, 0, nums.length - 1);
	}

	private int rob(int[] nums, int start, int end) {
		int include = 0, exclude = 0;
		for (int index = start; index <= end; index++) {
			int i = include, e = exclude;
			include = e + nums[index];
			exclude = Math.max(e, i);
		}
		return Math.max(include, exclude);
	}

}
