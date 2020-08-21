package package1;

public class Protection1 {
	private int pri_x;
	public int pub_x;
	protected int pro_x;
	int def_x;
	public Protection1() {
	System.out.println("\n Protection1 class package1 default const");
	pri_x=10;
	pro_x=20;
	pub_x=30;
	def_x=40;
	System.out.println("\n private pri_x:"+pri_x);
	System.out.println("\n public pub_x:"+pub_x);
	System.out.println("\n protected pro_x:"+pro_x);
	System.out.println("\n default def_x:"+def_x);
	}

}
