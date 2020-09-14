package fundamentals;
class SampleThread extends Thread
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
public class Multthreading_ThreadClassDemo2 {
	
	public static void main(String[] args) {
	SampleThread t1=new SampleThread();//new 
	SampleThread t2=new SampleThread();//new
	SampleThread t3=new SampleThread();//new 
	SampleThread t4=new SampleThread();//new
	
	t1.setName("t1");
	t2.setName("t2");
	t3.setName("t3");
	t4.setName("t4");
	

	t1.start();//runnable	
	t2.start();//runnable
	t3.start();//runnable	
	t4.start();//runnable
	
	
	/*
	t1.run();//runnable	
	t2.run();//runnable
	t3.run();//runnable	
	t4.run();//runnable
	*/
    //terminated
	}

}
