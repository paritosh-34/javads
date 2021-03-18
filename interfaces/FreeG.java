package com.chitkara.interfaces;

public class FreeG implements PubG, FreeFire {
	@Override
	public void jyadaVehicles() {
		System.out.println("Isme pubg se zyada vehicles hain!");
	}
	
	@Override
	public void achheGraphics() {
		System.out.println("Isme pubg se mast graphics hain!");
	}
	
	@Override
	public void achheWeapons() {
//		PubG.super.achheWeapons(); // This is how u call parent's method when overridden
		System.out.println("Isme pubg se achhe weapons hai hi, isme rafale bhi hai!");
	}

	@Override
	public void sastiRequirements() {
		System.out.println("Isse saste phone bhi chala sakte hain");
	}

	@Override
	public void genre() {
		// Override the ambiguity
		FreeFire.super.genre();
	}
}
