package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/first-bad-version/
 *
 */
public class FirstBadVersion {

	public int firstBadVersion(int n) {
		int start = 1, end = n, mid;
		while (start < end) {
			mid = start + (end - start) / 2;
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}

	private boolean isBadVersion(int version) {
		return false;
	}

}
