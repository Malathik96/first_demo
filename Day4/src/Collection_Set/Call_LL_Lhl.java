package Collection_Set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Call_LL_Lhl {
	public static void main(String[] args) {
		
		
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(30);
		ll.add(20);
		ll.add(10);
		ll.add(20);
		ll.add("Malathi");
		ll.add('A');
		ll.add("Malathi");
		ll.add(null);
		ll.add(null);
		System.out.println("Insertion Order :"+ll);		
	
        // insertion order and without duplicate values
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>(ll);
		System.out.println("Distinct Value :"+lhs);
		
		
		
		
	}

}
