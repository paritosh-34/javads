package com.chitkara.interfaces;

public interface PubG {
	public String checksss = "Check";
	public void jyadaVehicles();
	public void achheGraphics();
	
	default public void achheWeapons() {
		System.out.println("Isme achhe weapons hain!");
	}
	
	default public void genre() {
		System.out.println("Isme survival mode hai");
	}
}
