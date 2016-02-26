package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/two-sum/
 * 
 */
public class TwoSum {

	private static final int SIZE = 2;

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[SIZE];
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}

}
