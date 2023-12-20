package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicate_Values_AL {
	public static void main(String[] args) {
		ArrayList<Object> l=new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(100);
		l.add("Malathi");
		l.add('A');
		//System.out.println(l);
		l.add(1,1000);          //insert
		l.set(2, "Mahesh");     //replace
	/*	System.out.println(l);
		System.out.println(l.get(2)); //returns object values
        System.out.println(l.indexOf(100)); //return first index values
        System.out.println(l.lastIndexOf(100)); //return last index value
        System.out.println(l.size()); //size of the objects
        System.out.println(l.contains(100)); //object contains
        System.out.println(l.isEmpty());
        l.remove(2);
        System.out.println(l);
        l.removeAll(l);
        System.out.println(l);// It will remove objects or null values
        */
        Object[] ar=l.toArray(); 
        for(Object o:ar)
        {
        	System.out.println(o);
        }
        
        //String String = l.toString();
        //System.out.println(String);
	}
		
}

