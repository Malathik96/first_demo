package Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll_AL {
	public static void main(String[] args) {
List<Object> al=new ArrayList<>();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		List<Object> al2=new ArrayList<>();
		al2.add(300);
		al2.add(400);
		al2.add(500);
		al2.add(600);
		al2.add(700);
		
		al.removeAll(al2);
		System.out.println("Unmatched records :"+al);
		
		//al2.removeAll(al);
		//System.out.println("Unmatched records :"+al2);
	}

}


