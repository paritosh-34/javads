package com.chitkara.collectionframework;

import java.util.*;

public class ListInterface {
	public static void main(String[] args) {
		List<String> list1 = List.of("M", "T", "W", "Th", "F", "Sa", "S");
		
		List<String> list2 = new ArrayList<>(list1.subList(0, 5));
		list2.add("asdf");
		
		System.out.println(list2);
		
		List<Integer> l = new ArrayList<>(List.of(1,2,3,4,5));
		Collections.rotate(l, -1);
		System.out.println(l);
	}
}
