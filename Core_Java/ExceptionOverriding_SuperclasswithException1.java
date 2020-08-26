package fundamentals;
class Parent1
{  
	  void msg() throws ArithmeticException
	  {
		  System.out.println("parent");
	  }  
	  void msg1() throws Exception
	  {
		  System.out.println("parent");
	  }  
	  void msg2() throws Exception
	  {
		  System.out.println("parent");
	  }  
	  void msg3() throws Exception
	  {
		  System.out.println("parent");
	  } 
}  
class TestExceptionChild1 extends Parent1
{  
//	  void msg()throws Exception
//	  {  
//	    System.out.println("TestExceptionChild");  
//	  } 
	  
	 void msg1()throws Exception
	  {  
	    System.out.println("TestExceptionChild");  
	  } 
	 void msg2()throws ArithmeticException
	  {  
	    System.out.println("TestExceptionChild");  
	  } 
	 void msg3()
	  {  
	    System.out.println("TestExceptionChild");  
	  }
}

public class ExceptionOverriding_SuperclasswithException1 {

	public static void main(String[] args) {
		Parent p=new TestExceptionChild();  
	    p.msg();

	}

}
