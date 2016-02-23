package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/bitwise-and-of-numbers-range/
 *
 */
public class BitwiseAndOfNumbersRange {

	public int rangeBitwiseAnd(int m, int n) {
		int i = 0;
		for (; m != n; ++i) {
			m >>= 1;
			n >>= 1;
		}
		return n << i;
	}

}
