package Collection_Set;

import java.util.LinkedList;
import java.util.TreeSet;

public class Call_LL_Tset {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(10);
		ll.add(30);
		ll.add(20);
		ll.add(10);
		ll.add(20);
		System.out.println(ll);
		
        // Ascending order and without duplicate values
		TreeSet<Object> ts=new TreeSet<Object>(ll);
		System.out.println("Distinct Value :"+ts);
	}
}
