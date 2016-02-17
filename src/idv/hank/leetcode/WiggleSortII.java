package idv.hank.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/wiggle-sort-ii/
 *
 */
public class WiggleSortII {

	public void wiggleSort(int[] nums) {
		int median = 0;
		if (nums.length % 2 == 0) {
			median = (int) ((nums.length / (double) 2)) - 1;
		} else {
			median = (int) ((nums.length / (double) 2));
		}
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Collections.sort(list);
		int end = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = list.get(median--);
			} else {
				nums[i] = list.get(end--);
			}
		}
	}

}
