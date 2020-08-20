package fundamentals;

//Write a Java program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;

public class Selection_ifelseDemo {

	public static void main(String[] args) 

		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		year = sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println("\n Its a leap year");
		}
		else
		{
			System.out.println("\n Its not a leap year");
		}
	}

}
