package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/compare-version-numbers/
 * 
 */
public class CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {
		String[] data1 = version1.split("\\.");
		String[] data2 = version2.split("\\.");
		int length = Math.max(data1.length, data2.length);
		for (int i = 0; i < length; i++) {
			int d1 = (i < data1.length) ? Integer.parseInt(data1[i]) : 0;
			int d2 = (i < data2.length) ? Integer.parseInt(data2[i]) : 0;
			if (d1 > d2) {
				return 1;
			} else if (d1 < d2) {
				return -1;
			}
		}
		return 0;
	}

}
