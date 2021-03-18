package com.chitkara.questions;

public class Maze {
	static void getMazePaths(int n, int cc, int cr, String ans) {
		if (cc >= n || cr >= n) {
			return;
		}
		if (cc == n - 1 && cr == n - 1) {
			System.out.println(ans);
			return;
		}

		getMazePaths(n, cc + 1, cr, ans + "H");
		getMazePaths(n, cc, cr + 1, ans + "V");
	}

	static void get4DMazePaths(int n, int cc, int cr, String ans, boolean[][] visited) {
		if (cc >= n || cr >= n || cc < 0 || cr < 0 || visited[cr][cc] == true) {
			return;
		}
		if (cc == n - 1 && cr == n - 1) {
			System.out.println(ans);
			return;
		}

		visited[cr][cc] = true;

		get4DMazePaths(n, cc, cr - 1, ans + "U", visited);
		get4DMazePaths(n, cc + 1, cr, ans + "R", visited);
		get4DMazePaths(n, cc, cr + 1, ans + "D", visited);
		get4DMazePaths(n, cc - 1, cr, ans + "L", visited);

		visited[cr][cc] = false; // BackTracking

		return;
	}

	public static void main(String[] args) {
//		getMazePaths(3, 0, 0, "");

		boolean[][] visited = new boolean[3][3];
		get4DMazePaths(3, 0, 0, "", visited);
	}
}
