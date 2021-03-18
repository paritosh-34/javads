package com.chitkara.oops;

public class GharBananeKiFactory {
	public static void main(String[] args) {
		Ghar rajKaGhar = new Ghar();
		rajKaGhar.price = 2000;
		rajKaGhar.color = "Blue";
		rajKaGhar.size = 1000;
		
		Ghar shyamKaGhar = new Ghar();
		shyamKaGhar.price = 2000;
		shyamKaGhar.color = "Blue";
		rajKaGhar.size = 1000;
		
		rajKaGhar.gharKaPriceBata();
	}
}
