package idv.hank.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/contains-duplicate-ii/
 *
 */
public class ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int current = 0; current < nums.length; current++) {
			Integer previous = map.put(nums[current], current);
			if (previous != null && current - previous <= k) {
				return true;
			}
		}
		return false;
	}

}
