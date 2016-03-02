package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/count-primes/
 * 
 */
public class CountPrimes {

	public int countPrimes(int n) {
		boolean[] isPrime = initIsPrime(n);
		double length = Math.sqrt(n);
		for (int i = 2; i < length; i++) {
			if (!isPrime[i]) {
				continue;
			}
			for (int j = i * i; j < n; j += i) {
				isPrime[j] = false;
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i]) {
				count++;
			}
		}
		return count;
	}

	private boolean[] initIsPrime(int n) {
		boolean[] isPrime = new boolean[n];
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		return isPrime;
	}

}
