package Inheritance;

abstract class Vehical 
{
	abstract void run();
	abstract void stop();
	
	public void fuel(int a) {}
	public void fuel(float b, String c) {}
	public void fuel(char d,int e) {}
	
	int speed=11;
	long distance=1111;
	
	Vehical() {}
	Vehical(int f,int g) {}

	
}

class W2 extends Vehical
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("w2");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("w2...");
	}
	
	W2(){}
	
	int speed=22;
	long distance=2222;
	
	int num_of_tire=2;
	
	public void display()
	{
		System.out.println("Speed : " + this.speed);
		System.out.println("Distance : " + this.distance);
		System.out.println("num_of_tire : " + this.num_of_tire);
		
		System.out.println("Speed : " + super.speed);
		System.out.println("Distance : " + super.distance);
		
	}

}

class W3 extends Vehical
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("w3");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("w3...");
	}
	
	W3(){}
	
	int speed=33;
	long distance=3333;
	
	int num_of_tire=3;
	
	public void display()
	{
		System.out.println("Speed : " + this.speed);
		System.out.println("Distance : " + this.distance);
		System.out.println("num_of_tire : " + this.num_of_tire);
		
		System.out.println("Speed : " + super.speed);
		System.out.println("Distance : " + super.distance);
		
	}
}

class W4 extends Vehical
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("w4");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("w4...");
	}
	
	W4(){}
	
	int speed=44;
	long distance=4444;
	
	int num_of_tire=4;
	
	public void display()
	{
		System.out.println("Speed : " + this.speed);
		System.out.println("Distance : " + this.distance);
		System.out.println("num_of_tire : " + this.num_of_tire);
		
		System.out.println("Speed : " + super.speed);
		System.out.println("Distance : " + super.distance);
		
	}
}

class W8 extends Vehical
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("w8");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("w8...");
	}
	
	W8(){}
	
	int speed=88;
	long distance=8888;
	
	int num_of_tire=8;
	
	public void display()
	{
		System.out.println("Speed : " + this.speed);
		System.out.println("Distance : " + this.distance);
		System.out.println("num_of_tire : " + this.num_of_tire);
		
		System.out.println("Speed : " + super.speed);
		System.out.println("Distance : " + super.distance);
		
	}
}

public class InheritanceVehical
{
	public static void main(String args[])
	{
		Vehical v2 = new W2();
		Vehical v3 = new W3();
		Vehical v4 = new W4();
		Vehical v8 = new W8();
		
		v2.run();
		v2.stop();
		v3.run();
		v3.stop();
		v4.run();
		v4.stop();
		v8.run();
		v8.stop();

		W2 w2= new W2();
		w2.display();
		W3 w3= new W3();
		w3.display();
		W4 w4= new W4();
		w4.display();
		W8 w8= new W8();
		w8.display();
		
		
	}
}