package com.bear.offer.array;

/**
 * 
 * 2018年8月7日
 * 
 * @author Y.bear
 * @describe
 * 
 * 			有数量不限的硬币，币值为25分、10分、5分和1分，请编写代码计算n分有几种表示法。 给定一个int
 *           n，请返回n分有几种表示法。保证n小于等于100000，为了防止溢出，请将答案Mod 1000000007
 *           https://www.nowcoder.com/questionTerminal/c0503ca0a12d4256af33fce2712d7b24
 */
public class Coins {
	public int countWays(int n) {
		int[] coins = { 1, 5, 10, 25 };
		int[] dp = new int[100001];
		dp[0] = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = coins[i]; j <= n; j++) {
				dp[j] = (dp[j] + dp[j - coins[i]]) % 1000000007;
			}
		}
		return dp[n];

	}
}
