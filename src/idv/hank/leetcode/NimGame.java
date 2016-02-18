package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/nim-game/
 *
 */
public class NimGame {
	
	public boolean canWinNim(int n) {
        return ((n % 4 == 0) == false);
    }

}
