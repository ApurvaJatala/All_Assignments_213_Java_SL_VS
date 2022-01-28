package Inheritance;

class Product {

	int id=78;
	String name = "Amul";

	public void display()
	{
	System.out.println("Id : " +id );
	System.out.println("Name : " + name);

	}
	}

	class A extends Product{
	int count=50;
	String category="butter";

	public void display1()
	{
		System.out.println("Id : " +id );
		System.out.println("Name : " + name);
		System.out.println("Count : " + count);
		System.out.println("Category : " +category );

	
	}
	}

	class B extends Product{
	int count=90;
	String category="milk";

	public void display2()
	{
		System.out.println("Id : " +id );
		System.out.println("Name : " + name);
		System.out.println("Count : " + count);
		System.out.println("Category : " +category );
	}
	}

	class C extends Product{
	int count=56;
	String category="choco";

	public void display3()
	{
		System.out.println("Id : " +id );
		System.out.println("Name : " + name);
		System.out.println("Count : " + count);
		System.out.println("Category : " +category );
	}
	}

	class subA extends A{
	int price=30;
	int total_price;
	public void display4()
	{
	total_price= count * price;
	System.out.println("Id : " +id );
	System.out.println("Name : " + name);
	System.out.println("Count : " + count);
	System.out.println("Category : " +category );
	}
	}

	class subB extends B{
	int price=10;
	int total_price;
	public void display5()
	{
	total_price= count * price;
	System.out.println("Id : " +id );
	System.out.println("Name : " + name);
	System.out.println("Count : " + count);
	System.out.println("Category : " +category );
	}
	}

public class Demo {
	public static void main(String[] args) {
		subA p=new subA();
		p.display();
		p.display1();
		p.display4();

		subB q= new subB();
		q.display();
		q.display2();
		q.display5();

		C r=new C();
		r.display3();
		}


}
