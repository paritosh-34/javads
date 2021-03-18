package com.chitkara.questions;

public class KeypadCodes {
	static String getCode(char c) {
		if (c == '2') {
			return "abc";
		} else if (c == '3') {
			return "def";
		} else if (c == '4') {
			return "ghi";
		} else if (c == '5') {
			return "jkl";
		} else if (c == '6') {
			return "mno";
		} else if (c == '7') {
			return "pqrs";
		} else if (c == '8') {
			return "tuv";
		} else if (c == '9') {
			return "xyz";
		} else {
			return "";
		}
	}

	static void printCodes(String original, String ans) {
		if (original.length() == 0) {
			System.out.println(ans);
			return;
		}

		String chars = getCode(original.charAt(0));

		for (int i = 0; i < chars.length(); i++) {
			printCodes(original.substring(1), ans + chars.charAt(i));
		}
	}

	public static void main(String[] args) {
		printCodes("23", "");
	}
}
