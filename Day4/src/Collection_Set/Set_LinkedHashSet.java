package Collection_Set;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {
	public static void main(String[] args) {
		//Duplicate values not allowed
		//Insertion order maintained
		
		LinkedHashSet<Object> hs=new LinkedHashSet<>();
		hs.add(100);
		hs.add(10);
		hs.add("Malathi");
		hs.add('A');
		hs.add(null);
		hs.add(null);  //duplicate values doesn't print
		hs.add(100);   //duplicate values doesn't print
	    System.out.println("Insertion Order :"+hs);
	    System.out.println("repeated value :"+hs.add(100)); // false
	
		//convert array list
		System.out.println("Array List :");
		Object[] ar=hs.toArray();
		for(Object arr:ar)
		{
			System.out.println(arr); 
		}
		
		//convert string value
		String str=hs.toString();
		System.out.println("String Value :"+str);
			
	}

}


