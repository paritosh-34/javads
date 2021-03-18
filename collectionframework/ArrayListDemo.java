package com.chitkara.collectionframework;

import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		// Default non parameterized constructor
		ArrayList<Integer> list1 = new ArrayList<>();
		
		for (int i = 1; i <= 15; i++) {
			list1.add(i);
		}

		// Capacity wala constructor
		ArrayList<Integer> list2 = new ArrayList<Integer>(20);
		for (int i = 1; i <= 15; i++) {
			list2.add(i);
		}
		
		// Collection wala constructor
		ArrayList<Integer> list3 = new ArrayList<Integer>(list2);
		System.out.println(list3);
	}
}
