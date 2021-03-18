package com.chitkara.questions;

import java.util.*;

public class GenerateParenthesis {
	static List<String> list;
	
	static List<String> generateList(int n) {
		list = new ArrayList<>();
		generate(n, "", 0, 0);
		return list;
	}
	
	static void generate(int n, String ans, int op, int cl) {
		if (op == n && cl == n) {
//			System.out.println(ans);
			list.add(ans);
			return;
		}
		if (op < n) {
			generate(n, ans + "(", op + 1, cl);
		}
		if (cl < op) {
			generate(n, ans + ")", op, cl + 1);
		}
	}

	public static void main(String[] args) {
//		generate(3, "", 0, 0);
		List<String> myAns = generateList(2);
		
		System.out.println(myAns);
	}
}
