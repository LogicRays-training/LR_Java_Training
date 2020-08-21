package fundamentals;

public class Polymorphism_OverloadingDemo {

	public static int ADD(int x,int y)
	{
		return x+y;
	}

	public static double ADD(double x,double y)
	{
		return x+y;
	}
	public static void main(String[] args) {
	//Polymorphism_OverloadingDemo ob=new Polymorphism_OverloadingDemo();
	int number1,number2;
	double dnumber1,dnumber2;
	
	number1=10;
	number2=20;
	
	dnumber1=56.90;
	dnumber2=45.34;
	
	int res1=ADD(number1,number2);
	double res2=ADD(dnumber1,dnumber2);
	
	
	System.out.println("\n Integer addition is:"+res1);
	System.out.println("\n Double Addition is:"+res2);
	}

}


