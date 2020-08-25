package fundamentals;
interface DOB_Details
{
	void acceptDMY();
	void displayDMY();
}
interface Person_interface extends DOB_Details
{
	//abstract methods
	void acceptPersonInfo();
	void displayPersonInfo();
	//default method
	default void defmethod()
	{
		System.out.println("\n I am default method body");
	}
	//static method
	static void statmethod()
	{
		System.out.println("\n I am static method body");
	}
	
}
interface BankInfo
{
	void acceptBankInfo();
	void displayBankInfo();
}

class Doctor implements Person_interface
{

	@Override
	public void acceptPersonInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPersonInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptDMY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDMY() {
		// TODO Auto-generated method stub
		
	}
	
}
class Employee implements Person_interface,BankInfo
{

	@Override
	public void acceptBankInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayBankInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptPersonInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayPersonInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptDMY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDMY() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstraction_InterfaceDemo {

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.acceptPersonInfo();
	e1.defmethod();
	Person_interface.statmethod();
	


	}

}
