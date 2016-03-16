package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/sqrtx/
 * 
 */
public class SqrtRoot {

	public static void main(String[] args) {
		SqrtRoot solution = new SqrtRoot();
		System.out.println(solution.mySqrt(4));
	}

	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		int start = 1, end = x;
		while (start < end) {
			int mid = start + (end - start) / 2;
			if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
				return mid;
			} else if (mid > x / mid) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

}
