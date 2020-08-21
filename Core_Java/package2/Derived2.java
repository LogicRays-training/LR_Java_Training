package package2;

import package1.Protection1;

public class Derived2 extends Protection1 {
	public Derived2() {
		System.out.println("\n Derived1 class package1 default const");
		//System.out.println("\n private pri_x:"+pri_x);
		System.out.println("\n public pub_x:"+pub_x);
		System.out.println("\n protected pro_x:"+pro_x);
		//System.out.println("\n default def_x:"+def_x);
		}
}
