package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/power-of-three/
 *
 */
public class PowerOfThree {

	public boolean isPowerOfThree(int n) {
		return (n > 0 && 1162261467 % n == 0);
	}

}
