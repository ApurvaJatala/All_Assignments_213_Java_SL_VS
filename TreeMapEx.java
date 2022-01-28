package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx 
{
	 public static void main(String[] args) {

		 TreeMap<Integer, String> linkedHashMap = new  TreeMap<Integer, String>();
	        
	        linkedHashMap.put(1, new String("Mango"));
	        linkedHashMap.put(2, new String("Apple"));
	        linkedHashMap.put(3, new String("Chicoo"));
	        linkedHashMap.put(4, new String("Banana"));
	        linkedHashMap.put(5, new String("Grapes"));
	        linkedHashMap.put(6, new String("Orange"));
	        linkedHashMap.put(7, new String("Pineapple"));
	        linkedHashMap.put(8, new String("Peach"));
	        linkedHashMap.put(9, new String("Melon"));
	        linkedHashMap.put(10, new String("Custard Apple"));
	        
	        
	        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	        
	        for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
	        
	        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
	        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));

	        
	        System.out.println("LinkedHashMap contains banana as value? : " + linkedHashMap.containsValue("Banana"));
	        System.out.println("LinkedHashMap contains apple as value? : " + linkedHashMap.containsValue("Apple"));

	        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));

	        linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	        
	    }

}
