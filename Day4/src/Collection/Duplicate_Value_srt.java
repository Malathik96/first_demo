package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duplicate_Value_srt {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(300);
		al.add(500);
		al.add(10);
		al.add(200);
		System.out.println("Array list :"+al);
		
		Collections.sort(al);
		System.out.println("Ascending Order :"+al);
	}

}
