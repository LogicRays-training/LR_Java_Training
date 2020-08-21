package fundamentals;

import java.util.Scanner;

class StudInfo
{
	//States
	private int rollno;
	private String name;
	private double per;
	//behaviours/methods
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	public void DisplayStudentDetails()
	{
		System.out.println("\n Rollno:"+rollno);
		System.out.println("\n Name:"+name);
		System.out.println("\n Percentage:"+per);
	}

	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
	StudInfo s1=new StudInfo();
	s1.setRollno(11);
	System.out.println("\n Rollno:"+s1.getRollno());
    s1.DisplayStudentDetails();
	}

}
