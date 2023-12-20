package Collection_Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Map_LinkedHashMap {
	public static void main(String[] args) {

		Map<Integer, String> lm=new LinkedHashMap<>();
		
		lm.put(100,"Malathi");
		lm.put(20,"Mahesh");
		lm.put(300,"Mano");
		lm.put(10,"Mano");
		lm.put(20,"Latha");  
		lm.put(null, null);
		System.out.println(lm);
		System.out.println(lm.size());
		System.out.println(lm.containsKey(10));
        System.out.println(lm.containsKey(500));
        System.out.println(lm.containsValue("Malathi"));
        System.out.println(lm.containsValue("Aishu"));
        System.out.println(lm.isEmpty());
        System.out.println(lm.get(20));
        System.out.println(lm.keySet());        
        System.out.println(lm.values());
        System.out.println(lm.entrySet());
              
        Set<Integer> keySet=lm.keySet(); //insertion order and no duplicates
        System.out.println(keySet);
        
        Collection<String> values=lm.values();//duplicate allowed
        System.out.println(values);
        
        Set<Entry<Integer,String>> entrySet=lm.entrySet(); //pair entry     
        for(Entry<Integer,String>  entry : entrySet )
{
	System.out.println(entry);
}
	}

}
