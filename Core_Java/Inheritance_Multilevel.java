package fundamentals;

import java.util.Scanner;

class PersonInfo
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
//Intermidiate class
class StdInfo extends PersonInfo
{
	String adr,contactno;
	void acceptstdDetails()
	{
		acceptPersonDetails();//Person
		Scanner  sc=new Scanner(System.in);
		System.out.println("\n Enter Address:");
		adr=sc.next();
		System.out.println("\n Enter contact No:");
		contactno=sc.next();
	}
	void displaystdDetails()
	{
		displayPersonDetails();//Person
		System.out.println("\n Address:"+adr);
		System.out.println("\n Contact No:"+contactno);
	}
}
//child class
class MechStudDetails extends StdInfo
{
	double marks1,marks2,per,grade;
	String trade;
	void acceptMechStudDetails()
	{
		acceptstdDetails();//StdInfo
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter 2 subject marks:");
		marks1=sc.nextDouble();
		marks2=sc.nextDouble();
		System.out.println("\n Enter your tread:");
		trade=sc.next();
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
	void dipslayMechStudeDetails()
	{
		displaystdDetails();//StdInfo
		System.out.println("\n Marks1:"+marks1);
		System.out.println("\n Marks2:"+marks2);
		System.out.println("\n Your tread:"+trade);
		cal_result();
	}
}
public class Inheritance_Multilevel {

	public static void main(String[] args) {
	MechStudDetails ms1=new MechStudDetails();
	ms1.acceptMechStudDetails();
	ms1.dipslayMechStudeDetails();

	}

}
