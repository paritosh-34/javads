package com.chitkara.questions;

public class PrintAllSubsequences {
	static void printSubsequences(String original, String ans) {
		if (original.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		printSubsequences(original.substring(1), ans);
		printSubsequences(original.substring(1), ans+original.charAt(0));
	}
	
	public static void main(String[] args) {
		printSubsequences("abc", "");
	}
}
