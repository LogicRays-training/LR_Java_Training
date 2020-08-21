package fundamentals;

import java.util.Scanner;

//Parent class
class Person
{
	int id;
	String name;
	void acceptPersonDetails()
	{
		Scanner  sc=new Scanner(System.in);
		System.out.println("\n Enter Id and Name of the person:");
		id=sc.nextInt();
		name=sc.next();
	}
	void displayPersonDetails()
	{
		System.out.println("\n Id:"+id);
		System.out.println("\n Name:"+name);
	}
}
//Child class
class StudDetails extends Person
{
	double marks1,marks2,per,grade;
	void acceptStudDetails()
	{
		acceptPersonDetails();//Person
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter 2 subject marks:");
		marks1=sc.nextDouble();
		marks2=sc.nextDouble();
	}
	void cal_result()
	{
		double total=marks1+marks2;
		per=(total/2);
		System.out.println("\n Total:"+total);
		System.out.println("\n Percentage:"+per);
		if(per<40)
		{
			System.out.println("\n Grade:Fail");
		}
		else if(per>=40 && per<60)
		{
			System.out.println("\n Grade:2nd class");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("\n Grade:1st class");
		}
		else
		{
			System.out.println("\n Grade:Distinction");
		}
	}
	void dipslayStudeDetails()
	{
		displayPersonDetails();//Person
		System.out.println("\n Marks1:"+marks1);
		System.out.println("\n Marks2:"+marks2);
		cal_result();
	}
}
public class Inheritance_Simple_Single {

	public static void main(String[] args) {
	StudDetails s1=new StudDetails();
	s1.acceptStudDetails();
	s1.dipslayStudeDetails();

	}

}
