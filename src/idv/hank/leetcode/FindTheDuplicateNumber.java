package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/find-the-duplicate-number/
 * 
 */
public class FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {
		int low = 0, high = nums.length, mid;
		while (low < high) {
			mid = low + (high - low) / 2;
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= mid) {
					count++;
				}
			}
			if (count > mid) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

}
