package fundamentals;

public class Multithreding_RunnableInterfaceDemo implements Runnable {
	@Override
	public void run() {
		//Running
		System.out.println("\n I am in run() method,Running thread is:"+Thread.currentThread().getName());
		System.out.println("\n I am in run() method,Running thread is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Multithreding_RunnableInterfaceDemo tt1=new Multithreding_RunnableInterfaceDemo();//new
		Multithreding_RunnableInterfaceDemo tt2=new Multithreding_RunnableInterfaceDemo();//new
		Multithreding_RunnableInterfaceDemo tt3=new Multithreding_RunnableInterfaceDemo();//new
		Multithreding_RunnableInterfaceDemo tt4=new Multithreding_RunnableInterfaceDemo();//new
		
		Thread t1=new Thread(tt1);
		Thread t2=new Thread(tt2);
		Thread t3=new Thread(tt3);
		Thread t4=new Thread(tt4);
		
		
		t1.setName("nivedita1");
		t2.setName("nivedita2");
		t3.setName("nivedita3");
		t4.setName("nivedita4");
		
		t1.setPriority(10);//10
		t2.setPriority(5);//5
		t3.setPriority(1);//1
		t4.setPriority(6);//6
		
		//t1-->t4--->t2--->t3
		
		t1.start();//runnable
		t2.start();//runnable
		t3.start();//runnable
		t4.start();//runnable
	}

}
