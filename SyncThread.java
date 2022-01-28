package apu;



public class SyncThread extends Thread
{
	synchronized public void getLine()                     	
	{  
		for (int i = 0; i < 3; i++)
		{
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  // name of the thread
	   System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());  // it will print state of the thread running
	   System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
	   System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
		
		}  
	}
	
	public void run()
	{
		getLine();
	}
	
	 public static void main(String args[])
	 {  
	  
		 MyThread m1=new MyThread();  
		 MyThread m2=new MyThread();  
		 MyThread m3=new MyThread();
		 
		
	  
	  m1.setName("IT");
	  m2.setName("Finance");
	  m3.setName("HR");
	 
	  
	  m1.start();  
	  m2.start();  
	  m3.start();
	   
	 }  

}
