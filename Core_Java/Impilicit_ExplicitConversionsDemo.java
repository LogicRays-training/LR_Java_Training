package fundamentals;

public class Impilicit_ExplicitConversionsDemo {

	public static void main(String[] args) {
		 int i=10;
	     float f=i;
	     double d=f;
	     System.out.println("\n Implicit/Widing Conversion");
	     System.out.println("\n Integer i:"+i);
	     System.out.println("\n Floating point f:"+f);
	     System.out.println("\n Double d:"+d);
	     
	        double d1=28.96;
	        float f1=(float) d1;
	         int i1=(int) f1;
		     System.out.println("\n Explicit/Narrowing Conversion");
		     System.out.println("\n Integer i1:"+i1);
		     System.out.println("\n Floating point f1:"+f1);
		     System.out.println("\n Double d1:"+d1);
		     

	}

}
