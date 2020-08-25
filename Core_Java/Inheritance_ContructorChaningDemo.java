package fundamentals;

import java.util.Scanner;

//Parent class
class Person_new
{
	int id;
	String name;
	public Person_new(int i,String nm) {
		System.out.println("\n Person parent class const called");
		id=i;
		name=nm;
	}
	void displayPersonDetails()
	{
		System.out.println("\n Id:"+id);
		System.out.println("\n Name:"+name);
	}
}
//Child class
class StudDetails_new extends Person_new
{
	double marks1,marks2,per,grade;
	//contructor chaning
	public StudDetails_new(int i, String nm, double m1, double m2) {
		super(i,nm);
		System.out.println("\n StuDetails_new child class const called");
		marks1=m1;
		marks2=m2;
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
public class Inheritance_ContructorChaningDemo {

	public static void main(String[] args) {
	StudDetails_new s1=new StudDetails_new(11,"Nivedita",56.50,78.90);
	s1.dipslayStudeDetails();

	}

}
