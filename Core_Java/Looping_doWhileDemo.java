/*
       Arithmetic operation on two numbers
        1.Addition
        2.Substraction
        3.Multiplication
        4.Division
         If user enters wrong chice integer then error msg should display to user.
*/
package fundamentals;
import java.util.*;

public class Looping_doWhileDemo
{
 public static void main(String args[])
{
	int number1,number2,choice,result;
	char answer;
	do
	{
	//--------------------------------------------
        Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter two numbers:");
	number1=sc.nextInt();
        number2=sc.nextInt();
	
	System.out.println("\n Number1:"+number1);
	System.out.println("\n Number2:"+number2);
	
	System.out.println("\n\n Enter 1 for Addition");
	System.out.println("\n Enter 2 for Substraction");
	System.out.println("\n Enter 3 for Multiplication");
	System.out.println("\n Enter 4 for Division");
	System.out.println("\n Enter 5 for exit...!");
    
    System.out.println("\n Now enter your choice of number from(1 to 4):");
    choice=sc.nextInt();
    
    switch(choice)
    {
    	case 1:
    		    result=number1+number2;
    		    System.out.println("\n Addition is:"+result);
    		    break;
    	case 2:
    		    result=number1-number2;
    		    System.out.println("\n Substraction is:"+result);
    		    break;
    	case 3:
    		    result=number1*number2;
    		    System.out.println("\n Multiplication is:"+result);
    		    break;
    	case 4:
    		    result=number1/number2;
    		    System.out.println("\n Division is:"+result);
    		    break;
    	case 5:
    		    System.out.println("\n\n -------You exit from Calculator Now-------");
    		   
    		    break;
    	default:
                System.out.println("\n You have entered wrong choice value...!");
    		    break;   	
	}
		//--------------------------------------------
		
		System.out.println("\n Do you want to continue(y OR Y:)");
		answer=sc.next().charAt(0);
	}while(answer=='y'||answer=='Y');
}
}
