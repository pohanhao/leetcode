package idv.hank.leetcode;

/*
 * @author hank_hao
 * @URL https://leetcode.com/problems/reverse-bits/
 *
 */
public class ReverseBits {

	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
		binary = new StringBuffer(binary).reverse().toString();
		int num = Integer.parseUnsignedInt(binary, 2);
		return num;
	}

}