package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/add-binary/
 *
 */
public class AddBinary {

	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;) {
			int aNum = (i < 0) ? 0 : a.charAt(i--) - '0';
			int bNum = (j < 0) ? 0 : b.charAt(j--) - '0';
			int result = aNum + bNum + carry;
			carry = result / 2;
			sb.insert(0, result % 2);
		}
		return (carry == 1) ? sb.insert(0, carry).toString() : sb.toString();
	}

}
