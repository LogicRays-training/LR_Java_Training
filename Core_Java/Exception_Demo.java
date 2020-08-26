package fundamentals;

public class Exception_Demo {

	public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=0;
	a[2]=4;
	a[3]=2;
	a[4]=12;
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("\n a["+i+"]:"+a[i]);
	}
	try
	{
	a[7]=a[0]/a[1];
    System.out.println("\n Division result:"+a[4]);	
	}
	catch(ArithmeticException ex)
	{
		System.out.println("\n ----ArithmeticException----");
		ex.printStackTrace();
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		System.out.println("\n ---ArrayIndexOutOfBoundsException---- ");
		ex.printStackTrace();
	}
	finally
	{
		System.out.println("\n Finally block alyws execute");
    int sum=a[2]+a[4];
    System.out.println("\n Addition result:"+sum);
	}
	}

}
