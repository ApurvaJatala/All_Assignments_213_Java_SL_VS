package apu;

public class InnerClass 
{	
	private int data=30;  
	
	void display()
	{
		System.out.println("i am inside the outer class method");
	}
	 
	
	class Inner
	{  		
	 //private int data=20;
	  
		void msg()
		{
		  System.out.println("data is "+data);
		}  
	  
	  // calling the duplicate method of the outer class
		void display()
		{
		  System.out.println("i am inside the inner class method");
		}// inner class accessing the outside private variable
	 }  
	
		class Apu
		{
			void apu()
			{
				System.out.println("My name is Apurva");
			}
		}
	
	public static void main(String args[])
	{  
	  
	  InnerClass obj=new InnerClass();     // creating object of Outer class
	  
	  InnerClass.Inner in=obj.new Inner();   // creating object of Inner class
	  in.msg();  
	  in.display();
	  
	  InnerClass.Apu ap=obj.new Apu();
	  ap.apu();
	  
	 
	 } 
}
