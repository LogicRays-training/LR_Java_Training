package fundamentals;

import java.util.Scanner;

class Emp_Lec_Main{
	
	int id,account;
	static String company;
	String name;
	Scanner sc = new Scanner(System.in);
	static
	{
		System.out.println("\n I am inside static block of Employee class");
	}
	public Emp_Lec_Main() {
		System.out.println("\n I am in default const employee class");
	}
	void acceptDetails() {
		System.out.println("\n Enter id,name,account :");
		id=sc.nextInt();
		name = sc.next();
		account = sc.nextInt();
	}
	
	void displayDetails() {
		System.out.println("\n id : "+id);
		System.out.println("\n name : "+name);
		System.out.println("\n account : "+account);
		System.out.println("\n company : "+company);
	}
	static void change_cmp_name()
	{
		company="Niveditas LogicRays";
	}
	
	
}
public class Keywords_staticDemo {

	static
	{
		System.out.println("\n I am inside static block");
	}
	public static void main(String[] args) {
		System.out.println("\n\n I am inside main() block");
		Emp_Lec_Main.company="LogicRays,Ahmedabad";
		
		Emp_Lec_Main e1 = new Emp_Lec_Main();
		e1.acceptDetails();
		e1.displayDetails();
		
		Emp_Lec_Main e2 = new Emp_Lec_Main();
		e2.acceptDetails();
		e2.displayDetails();
		
		Emp_Lec_Main.change_cmp_name();
		Emp_Lec_Main e3 = new Emp_Lec_Main();
		e3.acceptDetails();
		e3.displayDetails();


	}

}
