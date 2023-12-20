package Collection;

import java.util.LinkedList;

public class Duplicate_Values_LL {
	public static void main(String[] args) {
LinkedList<Object> ll=new LinkedList<>(); //returns insertion order
		
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add("Malathi");
		ll.add(100);
		ll.add('A');
		ll.add(1,"One");    //insert
		ll.set(0,1000);     //replace
		ll.add(null);
		ll.add(null);
		ll.poll();
		System.out.println("all elements :"+ll);
		/*System.out.println("first index value :"+ll.get(1));
		System.out.println("index :"+ll.indexOf(1000));
		System.out.println("last Index value :"+ll.lastIndexOf(100));
		System.out.println("overall size :"+ll.size());
		System.out.println("get :"+ll.get(1));
		System.out.println("contains :"+ll.contains(300));
		System.out.println("emplty objects :"+ll.isEmpty());
		ll.remove("One");            //prticular objects only
		System.out.println(ll);
		ll.removeAll(ll);           //remove entire elements from ll
		System.out.println(ll);
 
		//convert the Array values
		
		System.out.println("Array List :");
        
		Object[] ar=ll.toArray();
		for(Object arr:ar)
		{
			System.out.println(arr);
		}
		
		// convert the string values
		
		String str=ll.toString();
		
			System.out.println("String values :"+str);*/
			
	}
        
}
