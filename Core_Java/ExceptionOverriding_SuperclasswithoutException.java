package fundamentals;

import java.io.IOException;

class Parent
{  
	  void msg()//method with no exception declared
	  {
		  System.out.println("parent");
	  }  
}  
class TestExceptionChild extends Parent
{  
	/*
	  void msg()throws IOException//method with checked exception declared
	  {  
	    System.out.println("TestExceptionChild");  
	  } 
	  
*/
	  void msg()throws ArithmeticException//method with unchecked exception declared
	  {  
	    System.out.println("TestExceptionChild");  
	  } 
}

public class ExceptionOverriding_SuperclasswithoutException {

	public static void main(String[] args) {
		Parent p=new TestExceptionChild();  
	    p.msg(); 

	}

}
