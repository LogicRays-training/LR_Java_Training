package fundamentals;

import java.util.Scanner;

class Student
{
	//States
	private int rollno;
	private String name;
	private double per;
	//behaviours/methods
	public void AcceptStudentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter rollno,name and percentage of student:");
        rollno=sc.nextInt();
        name=sc.next();
        per=sc.nextDouble();
	}
	public void DisplayStudentDetails()
	{
		System.out.println("\n Rollno:"+rollno);
		System.out.println("\n Name:"+name);
		System.out.println("\n Percentage:"+per);
	}
}
 public class Class_ObjectDemo {

	public static void main(String[] args) {
	//Object creation declaration in Java
	Student s1=new Student();
  
    s1.AcceptStudentDetails();
    s1.DisplayStudentDetails();
	}

}
