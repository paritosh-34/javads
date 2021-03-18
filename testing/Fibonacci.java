package com.chitkara.testing;

import java.util.Arrays;

public class Fibonacci {
	// Recursion + DP
	static long fib(int n, long[] storage) {
		 if (n == 0 || n == 1) {
			 return n;
		 }
		 if (storage[n] != -1) {
			 return storage[n];
		 }
		 
		 long myAns =  fib(n-1, storage) + fib(n-2, storage);
		 storage[n] = myAns;
		 
		 return myAns;
	}
	
	// Iterative DP
	static long iterFib(int n) {
		long[] storage = new long[n+1];
		
		Arrays.fill(storage, -1);
		// Base Case conversion
		storage[0] = 0;
		storage[1] = 1;
		
		for (int i=2;i<=n;i++) {
			storage[i] = storage[i-1] + storage[i-2];
		}
		
		return storage[n];
	}
	
	public static void main(String[] args) {
		int n = 50;
		
//		long[] storage = new long[(int)n+1];
//		Arrays.fill(storage, -1);
//		
//		long ans = fib(n, storage);
//		System.out.println(ans);
		
		System.out.println(iterFib(n));
	}
}
