package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * 
 */
public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num < min) {
				min = num;
			}
		}
		return min;
	}

}
