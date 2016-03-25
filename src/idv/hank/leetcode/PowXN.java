package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/powx-n/
 *
 */
public class PowXN {

	public double myPow(double x, int n) {
		long m = (n > 0) ? n : -(long) n;
		double ans = 1.0;
		while (m != 0) {
			if ((m & 1) == 1) {
				ans *= x;
			}
			x *= x;
			m >>= 1;
		}
		return (n >= 0) ? ans : 1 / ans;
	}

}
