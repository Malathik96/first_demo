package Collection_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HashMap {	
	public static void main(String[] args) {
		
		Map<Integer, String> hm=new HashMap<>();
		
		hm.put(100,"Malathi");
		hm.put(20,"Mahesh");
		hm.put(300,"Mano");
		hm.put(10,"Mano");
		hm.put(20,"Latha");
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(10));
        System.out.println(hm.containsKey(500));
        System.out.println(hm.containsValue("Malathi"));
        System.out.println(hm.containsValue("Aishu"));
        System.out.println(hm.isEmpty());
        System.out.println(hm.get(20));
        System.out.println(hm.keySet());        
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
              
        Set<Integer> keySet=hm.keySet(); //Random order and no duplicates
        System.out.println(keySet);
        
        Collection<String> values=hm.values();//duplicate allowed
        System.out.println(values);
        
        Set<Entry<Integer,String>> entrySet=hm.entrySet(); //pair entry     
        for(Entry<Integer,String>  entry : entrySet )
{
	System.out.println(entry);
}
        
	}
}
