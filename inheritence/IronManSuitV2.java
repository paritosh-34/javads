package com.chitkara.inheritence;

public class IronManSuitV2 extends IronManSuitV1 {
	String arcReactor = "Vibranium";
	
	public void uniBeam() {
		System.out.println("Main unibeam fenkta hun!");
	}
	
	// name, return type and parameters of method must be same.
	@Override // @Override not necessary but good practice for visibility.
	public void canFly() {
//		super.canFly(); // This is how u call parent's method
		System.out.println("Main ud sakta hun!");
	}
}
