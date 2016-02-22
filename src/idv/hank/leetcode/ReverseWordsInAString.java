package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/reverse-words-in-a-string/
 * 
 */
public class ReverseWordsInAString {

	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuffer buf = new StringBuffer();
		int length = words.length;
		for (int i = length - 1; i >= 0; i--) {
			if (words[i].length() == 0) {
				continue;
			}
			if (i != length - 1) {
				buf.append(" ");
			}
			buf.append(words[i]);
		}
		return buf.toString();
	}

}
