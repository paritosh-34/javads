package com.chitkara.oops;

public class Ghar {
	int price;
	int size;
	String color;
	
	public void gharKaPriceBata() {
		System.out.println(this.price);
	}
	
	public void setPrice(int price) {
		price = price; // AMBIGUITY
	}
}
