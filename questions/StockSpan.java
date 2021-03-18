package com.chitkara.questions;

import java.util.Arrays;

public class StockSpan {
	public static void main(String[] args) {
		int[] heights = { 30, 35, 40, 38, 35 };
		int n = heights.length;

		int[] span = new int[n];
		span[0] = 1;

		for (int i = 0; i < heights.length; i++) {
			span[i] = 1;

			for (int j = i - 1; j >= 0; j--) {
				if (heights[j] < heights[i]) {
					span[i]++;
				} else {
					break;
				}
			}
		}

		System.out.println(Arrays.toString(span));
	}
}
