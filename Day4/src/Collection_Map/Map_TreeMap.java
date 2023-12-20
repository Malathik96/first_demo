package Collection_Map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_TreeMap {
public static void main(String[] args) {
	
	Map<Integer,String> tm=new TreeMap();
	tm.put(100,"Malathi");
	tm.put(10, "Mahesh");
	tm.put(40, "MAno");
	tm.put(10,"Selva");
	tm.put(20, "Anu");
	tm.put(30, null);
	tm.put(60,null);
	System.out.println(tm);
	System.out.println(tm.containsKey(100));
	System.out.println(tm.containsKey(1000));
	System.out.println(tm.containsValue("Malathi"));
	System.out.println(tm.containsValue("Mahi"));
	System.out.println(tm.isEmpty());
	System.out.println(tm.keySet());
	System.out.println(tm.values());
	System.out.println(tm.get(100));
	System.out.println(tm.entrySet());
	
	Set<Integer> keySet=tm.keySet();
	System.out.println(keySet);
	
	Collection<String> values=tm.values();
	System.out.println(values);
	
	Set<Entry<Integer,String>> entrySet=tm.entrySet();
	for(Entry<Integer, String> entry : entrySet)
	{
	System.out.println(entry);
	}
	
	
}
}
