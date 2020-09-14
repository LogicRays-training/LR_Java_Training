package fundamentals;
class SampleThread1 extends Thread
{
	//runnig
		@Override
		public void run() {
			for(int i=1;i<=3;i++)
			{
				//System.out.println("\n Current thread:"+Thread.currentThread());
				System.out.println("\n i="+i+" and name of thread is:"+Thread.currentThread().getName());
				try 
				{
					Thread.sleep(3000);//3 sec.
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
			}
		}
}
public class Multithreading_joinMethodDemo {
	
	public static void main(String[] args) {
	SampleThread1 t1=new SampleThread1();//new 
	SampleThread1 t2=new SampleThread1();//new
	SampleThread1 t3=new SampleThread1();//new 
	SampleThread1 t4=new SampleThread1();//new
	
	t1.setName("t1");
	t2.setName("t2");
	t3.setName("t3");
	t4.setName("t4");
	
    
	t1.start();//runnable	
	t2.start();//runnable
	try 
	{
		t2.join();
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}

	t3.start();//runnable	
	t4.start();//runnable
	
	
	
	}

}
