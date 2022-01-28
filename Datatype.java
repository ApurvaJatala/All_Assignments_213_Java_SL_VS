package apu;

public class Datatype 
{
	public static void main(String[] args)
	{
		int i = 100;
		long l = i ;
		System.out.println("long value "+ l);
		
		int o = (int) l;
		System.out.println("int value "+ o);
		
		char t = (char) i;
		System.out.println("char value "+ t);
		
		double d = 190675665868.0079698465876867;
		float r = (float) d ;
		System.out.println("float value "+ r);
		System.out.println("double value "+ d);
		
		double d2 = 190675665868.0079698465876867;
		long l2 = (long) d2 ;
		int i2 = (int)l2;
		System.out.println("double value "+ d2);
		System.out.println("long value "+ l2);
		System.out.println("Int value "+ i2);
		
		float f = l;
		System.out.println("float value " + f);
		
		byte b;
		int ii = 257;
		double dd = 323.142;
		
		System.out.println("Conversion of int to byte.");
		b = (byte) ii;
		System.out.println("ii + " + ii + "b = " + b);
		
		System.out.println("\n Conversion of double to byte.");
		
		b = (byte) dd;
		System.out.println("dd = " + dd + " b = " + b);
			
	}
}
