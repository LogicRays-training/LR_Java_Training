package fundamentals;

public class Multithreading_ThreadClassDemo extends Thread {
	@Override
	public void run() {
		//Running
		System.out.println("\n I am in run() method,Running thread is:"+Thread.currentThread().getName());
		System.out.println("\n I am in run() method,Running thread is:"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Multithreading_ThreadClassDemo t1=new Multithreading_ThreadClassDemo();//new
		Multithreading_ThreadClassDemo t2=new Multithreading_ThreadClassDemo();//new
		Multithreading_ThreadClassDemo t3=new Multithreading_ThreadClassDemo();//new
		Multithreading_ThreadClassDemo t4=new Multithreading_ThreadClassDemo();//new
		
		t1.setName("nivedita1");
		t2.setName("nivedita2");
		t3.setName("nivedita3");
		t4.setName("nivedita4");
		
		t1.setPriority(MAX_PRIORITY);//10
		t2.setPriority(NORM_PRIORITY);//5
		t3.setPriority(MIN_PRIORITY);//1
		t4.setPriority(6);//6
		
		//t1-->t4--->t2--->t3
		
		t1.start();//runnable
		t1.start();//same thread running twice t1
		
		t2.start();//runnable
		t3.start();//runnable
		t4.start();//runnable
		
		
		
		
		
		

	}

}
