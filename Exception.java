package apu;

public class Exception 
{
	public static void main(String[] args) 
	{  
		int a[]=new int[7];    
        try{    
             
             a[8]=9;                                                        
            }    
           catch(ArrayIndexOutOfBoundsException e)  
            {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
            }    
        
        try{    
         
			a[6]=6/0;
           
           }    
          catch(ArithmeticException ee)  
           {  
               System.out.println(" Arithmetic Exception occurs");  
           }             
     
        
                
	}
}
