package fundamentals;

import java.util.Scanner;

public class CS_BranchingDemo_Integer {

	public static void main(String[] args) {
		int number1,number2,result,choice;
		Scanner sc=new Scanner(System.in);//input stream
		
		System.out.println("\n Enter two numbers:");
		number1=sc.nextInt();
		number2=sc.nextInt();
		
		System.out.println("\n Number 1 is:"+number1);
		System.out.println("\n Number 2 is:"+number2);	
		
		System.out.println("\n Press 1 :Addition");
		System.out.println("\n Press 2 :Sub");
		System.out.println("\n Press 3 :Multi");
		System.out.println("\n Press 4 :Divi");
		
		System.out.println("\n Pleaase eneter your choice of integer:");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			    result=number1+number2;
			    System.out.println("\n Addition is:"+result);
			    break;
		case 2:
		    result=number1-number2;
		    System.out.println("\n Sub is:"+result);
		    break;
		case 3:
		    result=number1*number2;
		    System.out.println("\n Multi is:"+result);
		    break;
		case 4:
		    result=number1/number2;
		    System.out.println("\n Division is:"+result);
		    break;
		default:
		    System.out.println("\n Sorry Invalid choice is enterd..!! ");
		    break;
		}
	}

}
