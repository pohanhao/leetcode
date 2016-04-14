package idv.hank.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/contains-duplicate/
 *
 */
public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : nums) {
			boolean isUnique = set.add(num);
			if (isUnique == false) {
				return true;
			}
		}
		return false;
	}

}
