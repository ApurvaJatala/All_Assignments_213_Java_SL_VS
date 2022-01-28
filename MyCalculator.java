//3.As a developer, write a program to create an arithmetic calculator.

package ArithmeticCalculator;

import java.util.Scanner;

public class MyCalculator 
{
	public static void main(String[] args)
	{
		Scanner S= new Scanner(System.in);
		double n1, n2;
		
		System.out.println("Enter two numbers for Calculation ");
		System.out.println("Enter First Number : ");
		n1=S.nextDouble();
		System.out.println("Enter Second Number : ");
		n2=S.nextDouble();

		System.out.println("Addition : "+ (n1+n2));
		System.out.println("Substraction : "+ (n1-n2));
		System.out.println("Multiplication : "+ (n1*n2));
		System.out.println("Divison : "+ (n1/n2));
	}
}

 
 
