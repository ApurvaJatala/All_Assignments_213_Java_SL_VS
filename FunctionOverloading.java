package Constructor;

public class FunctionOverloading {



	
	public static int calculate(int x,int y)
	{
		int z=x+y;
		return z;
	}
	
	public static int calculate(int r)
	{
		//A=πr2
		float area= 3.14f * r * r;	
		return (int) area;
	}
	
	public static int calculate(int w,double l)
	{
		//A=wl
		int area1= (int) (w * l);	
		return area1;
	}
	
	public static void main( String args[])
	{
		System.out.println(calculate(2,3));
		System.out.println(calculate(2));
		System.out.println(calculate(7,3));
	}
		}




