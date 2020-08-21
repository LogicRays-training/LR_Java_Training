package fundamentals;

public class CS_NestingforDemo {

	public static void main(String[] args) {
	System.out.println("\n Pattern-1");
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=3;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	/*
	 i=1 1<=3 T
	    j=1 1<=3 T
	    j++ j=2 2<=3 T  
	    j++ j=3 3<=3 T * * *
	    j++ j=4 4<=3 F
	    
	i=2 2<=3 T
	   j=1
	 */
	System.out.println("\n Pattern-2");
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println("\n Pattern-3");
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" "+j+" ");
		}
		System.out.println();
	}

	}

}
