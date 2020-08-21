package fundamentals;

import java.util.Scanner;

public class Array_OneDDemo {

	public static void main(String[] args) {
	int range,searchkey;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n Enter range for accepting array elemnts:");
	range=sc.nextInt();
	
	int a[]=new int[range];
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print("\n Enter elemnt "+(i+1)+":");
		a[i]=sc.nextInt();
	}
	System.out.println("\n Actual array is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("\n a["+i+"]:"+a[i]);
	}
	//Sorting elemnt from array
	System.out.println("\n\n Before Sorting array is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("\n"+a[i]);
	}
	for(int i=0;i<=a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		    if(a[i]>a[j])
		    {
		       int temp;
		       temp=a[i];
		       a[i]=a[j];
		       a[j]=temp;
		    }
		}
	}
	System.out.println("\n\n After Sorting array is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("\n"+a[i]);
	}
	//Sarching elemnt from array
	System.out.println("\n Please enter search elemnt:");
	searchkey=sc.nextInt();
	
	int occurance=0;//no elemnt found
	
    for(int i=0;i<a.length;i++)
    {
    	if(searchkey==a[i])
    	{
    		occurance++;
    		System.out.println("\n Elemnt found at place "+(i+1));
    	}
    }
    if(occurance==0)
    {
    	System.out.println("\n Sorry "+searchkey+" elemnt is not found in array");
    }
    else
    {
    	System.out.println("\n"+searchkey+" Elemnt found "+occurance+" times in array");
    }

	}

}
