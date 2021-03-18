package com.chitkara.questions;

import java.util.*;

class Solution2 {
	static int calculate(String s, String t, String ans, Map<String, Map<String, Integer>> storage) {
//		System.out.println("'" + s + "' '" + t + "' '" + ans + "'");
		if (s.length() == 0) {
			if (t.equals(ans)) {
				return 1;
			}
			return 0;
		}
		
		if (storage.containsKey(s)) {
			Map<String, Integer> maybe = storage.get(s);
			if (maybe.containsKey(ans)) {
				return maybe.get(ans);
			}
		}

		String bachaHua = s.substring(1);
		char pehla = s.charAt(0);

		int inc = 0, exc = 0;
		String newAns = ans + pehla;

		if (ans.length() < t.length() && newAns.equals(t.substring(0, newAns.length()))) {
			inc = calculate(bachaHua, t, newAns, storage);
		}
		if (bachaHua.length() + ans.length() >= t.length()) {
			exc = calculate(bachaHua, t, ans, storage);
		}

		int finalAns = inc + exc;
		Map<String, Integer> temp = new HashMap<String, Integer>();
		temp.put(ans, finalAns);
		storage.put(s, temp);

		return finalAns;
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

		for (int i = 0; i < s.length(); i++) {
			String currentChar = Character.toString(s.charAt(i));
			if (t.contains(currentChar) == false) {
				s = s.replace(currentChar, "");
			}
		}

		int index = 0;
		char initialChar = t.charAt(0);
		char lastChar = t.charAt(t.length() - 1);

		while (index != s.length()) {
			if (initialChar == s.charAt(index)) {
				break;
			}
			index++;
		}
		s = s.substring(index);

		index = s.length() - 1;
		while (index != -1) {
			if (lastChar == s.charAt(index)) {
				break;
			}
			index--;
		}
		s = s.substring(0, index + 1);

		Map<String, Map<String, Integer>> storage = new HashMap<String, Map<String, Integer>>();

		return calculate(s, t, "", storage);
	}
}

public class DistinctSubsequences {
	public static void main(String[] args) {
		Solution2 ans = new Solution2();

//		String s1 = "rabbbit";
//		String s2 = "rabbit";
		String s1 = "aabdbaabeeadcbbdedacbbeecbabebaeeecaeabaedadcbdbcdaabebdadbbaeabdadeaabbabbecebbebcaddaacccebeaeedababedeacdeaaaeeaecbe";
		String s2 = "bddabdcae";
		System.out.println(ans.numDistinct(s1, s2));
	}
}
