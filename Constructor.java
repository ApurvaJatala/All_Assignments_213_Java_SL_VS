//5.Write a program to demonstrate the uses of constructors and its types.

package apu;

public class Constructor 
{
	int a;
	float b;
	int c;

	Constructor(){}
	
//creating arg constructor for square  
	    Constructor(int s)
	    {  
	    	a=s*s;
	    }     
	    
	    
// Area of circle A=πr2	    
	   Constructor(float r)
	   {  
		   b=3.14f * r *r;
	   }  
	    
	    //creating arg constructor for rectangle A=wl  
	   Constructor(int w, int l)
	   {  
		   c=w*l;
	   } 
	    
	    
	    void display()
	    {
	    	System.out.println("Area of square: "+ a);
	    	System.out.println("Area of rectangle: "+ c);
	    	System.out.println("Area of circle: "+ b);
	    }  
	   
	    public static void main(String args[]){  
	    
	    Constructor s1 = new Constructor(3);  
	   Constructor s2 = new Constructor(5);  
	   Constructor s3 = new Constructor(6,8);  

	    
	    s1.display(); 
	    s2.display();
	   s3.display();  
	   
	   
	   
	   
	   }  
	 
}
