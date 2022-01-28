package apu;

import java.util.*;

public class HashSetEx 
{
	
		public static void main(String[] args)
		{
			
			//LinkedHashSet<String> hs=new LinkedHashSet<String>();
			HashSet<String> fruit=new HashSet<String>();
			
			fruit.add("Mango");
			fruit.add("Apple");
			fruit.add("Chicoo");
			fruit.add("Banana");
			fruit.add("Grapes");
			fruit.add("Orange");
			fruit.add("Pineapple");
			fruit.add("Peach");
			fruit.add("Melon");
			fruit.add("Custard Apple");
					
			System.out.println("Hashset is "+fruit);
			System.out.println("Size of Hashset is "+ fruit.size());
			System.out.println("remove the element "+fruit.remove("Mango")+fruit.remove("Apple"));
			System.out.println("add 3 fruits to hashset  " + fruit.add("blueberry") + fruit.add("cherry") + fruit.add("berry"));
			System.out.println("Does hashset contains this 'orange' element  " + fruit.contains("Orange"));		
			System.out.println("is hashset empty  " + fruit.isEmpty());
			
			
			
			//fruit.clear();
		   // System.out.println("get class  " +fruit.getClass());
			
		    System.out.println("is hashset empty  " +fruit.isEmpty());
		    
		    
			
		}
	

}
