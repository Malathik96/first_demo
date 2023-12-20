package Collection_Set;

import java.util.HashSet;

public class Set_HashSet {
	public static void main(String[] args) {
		//Duplicate values not alloved
		//No insertion order maintained(Random order)
		
		HashSet<Object> hs=new HashSet<>();
		hs.add(100);
		hs.add("Malathi");
		hs.add('A');
		hs.add(null);
		hs.add(null);  //duplicate values doesn't print
		hs.add(100);   //duplicate null doesn't print
		System.out.println("Random Order :"+hs);
		System.out.println("repeated value :"+hs.add(100)); // false
			
		
	}

}
