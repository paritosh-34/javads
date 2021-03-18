package com.chitkara.questions;

import java.util.*;

class Solution {
	static int ways(int[] coins, int amount, int i, int[][] storage) {
		if (amount == 0) {
			return 1;
		}
		if (i == 0) {
			return 0;
		}
		if (storage[i][amount] != -1) {
			return storage[i][amount];
		}

		int inc = 0, exc = 0;

		if (amount >= coins[i - 1]) {
			inc = ways(coins, amount - coins[i - 1], i, storage);
		}
		exc = ways(coins, amount, i - 1, storage);

		int ans = inc + exc;
		storage[i][amount] = ans;

		return ans;

	}

	public int coinChange(int[] coins, int amount) {
		int n = coins.length;
		int[][] storage = new int[n+1][amount + 1];

		for (int[] row : storage) {
			Arrays.fill(row, -1);
		}

		// Base Cases
		for (int i = 0; i <= n; i++) {
			storage[i][0] = 1;
		}
		for (int i = 1; i <= amount; i++) {
			storage[0][i] = 0;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < amount + 1; j++) {
				int inc = 0, exc = 0;

				if (j >= coins[i - 1]) {
					inc = storage[i][j - coins[i-1]];
				}
				exc = storage[i - 1][j];

				int ans = inc + exc;
				storage[i][j] = ans;
			}
		}

		for (int[] row : storage) {
			System.out.println(Arrays.toString(row));
		}

		return storage[n][amount];
	}
}

public class CoinChange {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };

		Solution myans = new Solution();
		System.out.println(myans.coinChange(coins, 5));
	}
}
