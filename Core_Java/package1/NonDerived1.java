package package1;

public class NonDerived1 {
	public NonDerived1() {
		Protection1 pr1=new Protection1();
		System.out.println("\n Derived1 class package1 default const");
		//System.out.println("\n private pri_x:"+pr1.pri_x);
		System.out.println("\n public pub_x:"+pr1.pub_x);
		System.out.println("\n protected pro_x:"+pr1.pro_x);
		System.out.println("\n default def_x:"+pr1.def_x);
		}
}
