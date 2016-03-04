package idv.hank.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/largest-number/
 * 
 */
public class LargestNumber {

	public String largestNumber(int[] nums) {
		List<Integer> digitals = Arrays.stream(nums).boxed().collect(Collectors.toList());
		digitals.sort((n1, n2) -> {
			return compare(n1, n2);
		});
		return toString(digitals);
	}

	private int compare(int n1, int n2) {
		String i = String.valueOf(n1);
		String j = String.valueOf(n2);
		String s1 = i + j;
		String s2 = j + i;
		return -s1.compareTo(s2);
	}

	private String toString(List<Integer> digitals) {
		if (digitals.get(0) == 0) {
			return "0";
		}
		StringBuffer sb = new StringBuffer();
		for (int n : digitals) {
			sb.append(n);
		}
		return sb.toString();
	}

}
