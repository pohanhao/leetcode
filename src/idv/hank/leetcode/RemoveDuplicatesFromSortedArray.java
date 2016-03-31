package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		int currnet = 0;
		for (int num : nums) {
			if (num > nums[currnet]) {
				nums[++currnet] = num;
			}
		}
		return currnet + 1;
	}

}
