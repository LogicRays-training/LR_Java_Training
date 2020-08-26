package fundamentals;
class InsufficientFunds extends Exception
{
	double difference;

	public double getDifference() {
		return difference;
	}
	public InsufficientFunds(double difference) {
		this.difference=difference;
	}
	
}
class AccountHolder
{
	int accountNo;
	double balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposite(double amt)
	{
		balance=balance+amt;
	}
	public void withdrawal(double amt) throws InsufficientFunds {
		if(amt<=balance)
		{
			balance=balance-amt;
		}
		else
		{
			double need;
		    need=amt-balance;
		    throw new InsufficientFunds(need);
			
		}
	}
}
public class Exception_CustomeExceptionDemo {

	public static void main(String[] args) {
	AccountHolder acc1=new AccountHolder();
	acc1.setAccountNo(1000);
	System.out.println("\n Your acc no:"+acc1.getAccountNo());
	System.out.println("\n Your balance is:"+acc1.getBalance());
	
	System.out.println("\n 1st deposite");
	acc1.deposite(2000.00);
	System.out.println("\n Your crrent balance is:"+acc1.getBalance());
	
	System.out.println("\n 1st withdrawal of 1000rs");
	try 
	{
		acc1.withdrawal(3500.00);
		System.out.println("\n Your crrent balance is:"+acc1.getBalance());
	} 
	catch (InsufficientFunds e) 
	{
		
		System.out.println("\n Sorry insufficient amont as you need more "+e.getDifference());
	}

	}

}
