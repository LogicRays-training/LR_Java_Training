package fundamentals;
class First 
{
	void display(String msg)
	{
		System.out.print("[");
		try 
		{
			Thread.sleep(3000);
			System.out.println(msg+"]");
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
class Second extends Thread
{
	String msg;
	First f;
	public Second(String msg,First f) {
	this.msg=msg;
	this.f=f;
	start();
	}
	@Override
	public void run() {
		
		f.display(msg);	
		
	}
}
public class Multithreading_WithoutSynchronizationDemo {

	public static void main(String[] args) {
	First f=new First();
	Second t1=new Second("Welcome", f);
	Second t2=new Second("To", f);
	Second t3=new Second("LogicRays", f);
	

	}

}
