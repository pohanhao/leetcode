package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/power-of-two/
 * 
 */
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		if (n < 0) {
			return false;
		}
		String digitals = Integer.toBinaryString(n);
		char[] chars = digitals.toCharArray();
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '1') {
				count++;
			}
		}
		return count == 1;
	}

}
