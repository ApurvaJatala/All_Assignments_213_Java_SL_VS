//1.Write a program which will take a string as input and will convert it into other primitive data types.

package Assignments;

public class StringPrimitiveConversion 
{
	public static void main(String[] args)
	{
		String s = "97";
		
		int n =Integer.parseInt(s);
		byte b =Byte.parseByte(s);
		short sh =Short.parseShort(s);
		long l =Long.parseLong(s);
		float f =Float.parseFloat(s);
		double d =Double.parseDouble(s);
		//char c =Char.parseChar(s);
		boolean bo =Boolean.parseBoolean(s);
		
	
		
		System.out.println("Integer :" + n);
		System.out.println("Byte :" +b);
		System.out.println("Short :" +sh);
		System.out.println("Long :" +l);
		System.out.println("Float :" +f);
		System.out.println("Double :" +d);
		System.out.println("Boolean :" +bo);

		
	}
}
