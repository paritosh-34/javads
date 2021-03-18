package com.chitkara.testing;

public class Increment {
	static void increment(int a) {
		a++;
	}
	public static void main(String[] args) {
		int a = 10;
		increment(a);
		
		System.out.println(a);
	}
}
