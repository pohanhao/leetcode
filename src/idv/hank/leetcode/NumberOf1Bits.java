package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/number-of-1-bits/
 * 
 */
public class NumberOf1Bits {

	public int hammingWeight(int n) {
		int count = 0;
		char[] array = Integer.toBinaryString(n).toCharArray();
		for(char c : array) {
			if(c == '1') {
				count++;
			}
		}
		return count;
	}

}
