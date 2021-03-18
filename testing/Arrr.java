package com.chitkara.testing;

import java.util.Arrays;

public class Arrr {
	public static void main(String[] args) {
		int[][] storage = new int[5][5];

		for (int[] row : storage) {
			Arrays.fill(row, -1);
			System.out.println(Arrays.toString(row));
		}

	}
}
