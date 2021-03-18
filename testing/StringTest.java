package com.chitkara.testing;

class Solution {
	static int count = 0;

	static void calculate(String s, String t, String ans) {
		if (s.length() == 0) {
			if (t.equals(ans)) {
				System.out.println("-->" + ans + " " + t);
				count++;
			} else {
				System.out.println(ans + " " + t);
			}
			return;
		}

		String bachaHua = s.substring(1);
		char pehla = s.charAt(0);

		calculate(bachaHua, t, ans);
		calculate(bachaHua, t, ans + pehla);
	}

	public int numDistinct(String s, String t) {
		int l1 = s.length();
		int l2 = t.length();

		if (l1 == l2) {
			if (s.equals(t)) {
				return 1;
			} else {
				return 0;
			}
		}

		calculate(s, t, "");

		return count;
	}
}

public class StringTest {
	public static void main(String[] args) {
		Solution myS = new Solution();
		int ans = myS.numDistinct("babgbag", "bag");
		System.out.println(ans);
	}
}
