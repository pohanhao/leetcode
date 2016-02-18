package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * 
 */
public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		int start = 0, end = nums.length - 1, mid;
		while (start < end) {
			mid = (start + end) / 2;
			if (nums[mid] > nums[end]) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return nums[start];
	}

}
