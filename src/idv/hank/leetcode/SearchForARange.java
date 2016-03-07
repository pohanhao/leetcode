package idv.hank.leetcode;

import java.util.Arrays;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/search-for-a-range/
 * 
 */
public class SearchForARange {

	public int[] searchRange(int[] nums, int target) {
		int index = Arrays.binarySearch(nums, target);
		if (index < 0) {
			return new int[] { -1, -1 };
		}
		return getResult(nums, target, index);
	}

	private int[] getResult(int[] nums, int target, int index) {
		int left = -1;
		int right = -1;
		for (left = index; left != 0 && target == nums[left - 1]; left--)
			;
		for (right = index; right != nums.length - 1 && target == nums[right + 1]; right++)
			;
		return new int[] { left, right };
	}

}
