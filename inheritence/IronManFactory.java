package com.chitkara.inheritence;

public class IronManFactory {
	public static void main(String[] args) {
		// Case 1.
		IronManSuitV1 suit1 = new IronManSuitV1();
		System.out.println(suit1.arcReactor);
		suit1.flameThrower();
		suit1.canFly();
		
		// Case 2.
		IronManSuitV1 suit2 = new IronManSuitV2();
//		suit2.uniBeam(); // Gives a compilation undefined Exception
		((IronManSuitV2)suit2).uniBeam(); // TypeCasting
		System.out.println(suit2.arcReactor); 	/* Palladium - bcoz it is an Exception in Java
												 * Data Members will be resolved depending upon
												 * the parent's reference which here:
												 * is IronManSuitV1...
												 * Therefore we get Palladium.
												 */
		System.out.println(((IronManSuitV2)suit2).arcReactor);
		suit2.canFly(); // It's Overridden
		
		// Case 3.
		
//		IronManSuitV2 suit3 = new IronManSuitV1();
//		suit3.uniBeam(); // Mismatch of blueprint in heap and reference in stack.
						 /* child can't be parent of parent
						  * Here we were making child the parent and parent the child
						  * Therefore mismatch
						  * (Compilation Error) The compiler sees the reference to be V2
						  * and the object to be of V1.
						  */
		
		// Case 4.
		IronManSuitV2 suit4 = new IronManSuitV2();
		System.out.println(suit4.arcReactor);
		suit4.flameThrower();
		suit4.canFly();
		
	}
}
