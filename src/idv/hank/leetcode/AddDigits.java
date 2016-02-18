package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/add-digits/
 *
 */
public class AddDigits {

	public int addDigits(int num) {
		int sum = 0;
		do {
			sum = 0;
			for (; num > 0; num /= 10) {
				sum += num % 10;
			}
			num = sum;
		} while (sum >= 10);
		return sum;
	}

}
