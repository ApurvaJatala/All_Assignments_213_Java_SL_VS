package Assignments;

public class SleepThread extends Thread {

public void run(){  
 for(int i=1;i<3;i++){  
 System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :" + Thread.currentThread().getState());  // it will print state of the thread running
  System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :" + Thread.currentThread().getId());
 System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :" + Thread.currentThread().isAlive());
 System.out.println("running thread name is:"+Thread.currentThread().getName());
 }  
}  
 

public static void main(String args[]){  
	SleepThread m1=new SleepThread();  
	SleepThread m2=new SleepThread();  
	SleepThread m3=new SleepThread();

 m1.setName("IT");
 m2.setName("Finance");
 m3.setName("HR");

 
 m1.start();  
 m2.start();  
 m3.start();
 
}  
}
