package Collection;

	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Vector;

	public class LinkedListDemo1 {
	    public static void main(String a[]){
	    	
	    	int a1=6;
	    	
	        LinkedList<String> ll = new LinkedList<String>();
	        
	        ll.add("May");
	        ll.add("June");
	        ll.add("July");
	        ll.add("August");
	        ll.add("April");
	        ll.add("November");
	        //ll.add(a1);    // wrapping of primitive is done automatically to convert to Integer object
	                
	        ll.addLast("December");
	        ll.addFirst("January");
	        ll.add(2, "March");
	        ll.add(1, "Febuary");
	        ll.add(8, "September");
	        ll.add(9, "October");
	        
	       /* ll.add(6, "August");
	        ll.remove(3);
	        
	        ll.addFirst("Hello");
	        ll.add(5, "August");
	        ll.remove(3);*/
	                 
	        Iterator itr=ll.iterator();
	        while(itr.hasNext()) {
	        System.out.println("list is"+ itr.next());
	        }
	       
	        System.out.println(ll);
	        System.out.println("Size of the linked list: "+ll.size());
	        System.out.println("Is LinkedList empty? "+ll.isEmpty());
	        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
	               
	        
	        
	        
	    }
	}