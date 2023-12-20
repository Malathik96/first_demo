package Collection;

import java.util.ArrayList;
import java.util.List;

public class Duplicate_Values {
	public static void main(String[] args) {
		
		/*
		 *ArrayList is resizable
		 *Hetrogeneous objects is allowed
		 *Data Structure:Grovable Array
		 *
		 *Class: package,constructor,methods,variables
		 */
		//List<Integer> l=new ArrayList<> ();  //only integer values accepted
		  ArrayList<Comparable> l=new ArrayList<Comparable>();  //it will allowes all kind of datatype
		
		System.out.println(l);
		l.add(10);      //0
		l.add(20);      //1
		l.add(40);      //2
		l.add(30);      //3
		l.add(30);      //4
		l.add("Malu");  //5
		l.add("Mahesh");//6
		l.add('A');     //7
		l.add(0, "One");//8
		System.out.println(l);
		l.add(2,400);                    // inserting 
		System.out.println(l);
		l.set(2,500);                    //replace
		System.out.println(l);
		System.out.println(l.indexOf(10));//returns first index value
		System.out.println(l.lastIndexOf(30));//returns last index value
		System.out.println(l.contains(2));
		//System.out.println(l.contains(0));
		System.out.println(l.get(2)); // enter the index values ,get object vallues
		//System.out.println(l.get(10));
		System.out.println(l.size());    //index size
		System.out.println(l.isEmpty());  //if any empty values in array		
	}

}
