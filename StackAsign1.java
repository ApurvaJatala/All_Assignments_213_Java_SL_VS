/*
Assignment 1:
Stack 
1) add 5 fruits
2) add 4 cities
3) add 4 integer variables
4) add two char variables
operations:
1- print stack
2- remove 5 elements
3- peek element
4- remove 2 elements
5- poll 2 elements
6- check top of stack and print
7- check index of "Apple" and "Delhi"
*/


package Stack;

import java.util.Stack;

public class StackAsign1 
{	
	public static void main(String[] args) 
	 { 
	     // Default initialization of Stack 
	     Stack stack1 = new Stack(); 

	     // Initialization of Stack using Generics 
	     Stack<String> stack2 = new Stack<String>(); 

	     // pushing the elements 
	     
	     stack1.push("Apple"); 
	     stack1.push("Mango");
	     stack1.push("Banana");
	     stack1.push("Cherry");
	     stack1.push("Strawberry");
	     
	     stack1.push("Pune"); 
	     stack1.push("Solapur");
	     stack1.push("Mumbai");
	     stack1.push("Benglore");
	     
	     stack1.push(1);
	     stack1.push(2);
	     stack1.push(3);
	     stack1.push(4);
	     
	     stack1.push('a');
	     stack1.push('b');
	     
	     // Priniting the Stack Elements 
	     System.out.println(stack1); 
	    
	     
	     // Removing 5 elements using pop() method 
	     System.out.println("Popped element from stack 1: " + stack1.pop()+ stack1.pop()+ stack1.pop()+ stack1.pop() + stack1.pop()); 
	     
	     // Fetching the element at the head of the Stack 1
	     System.out.println("The element at the top of the"+ " stack-1 is: " + stack1.peek());
	     
	  // Removing 2 elements using pop() method 
	     System.out.println("Popped element from stack 1: " + stack1.pop()+ stack1.pop());
	     
	     
	     System.out.println("index of element Apple inside the stack :"+ stack1.indexOf("Apple"));
	     System.out.println("index of element Delhi inside the stack :"+ stack1.indexOf("Delhi"));

	    
	 } 

}
