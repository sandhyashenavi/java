package collection;

import java.util.HashMap;
import java.util.Map;

public class hash_map_demo {

	public static void main(String[] args) {
	 HashMap<Integer, String> hm=new HashMap<Integer, String>();
	 hm.put(10, "Sachin");
	 hm.put(18, "Virat");
	 hm.put(45, "Rohit");
	 hm.put(12, "Sachin");
	 hm.put(null, "abc");
	 System.out.println(hm);
     for(Map.Entry a:hm.entrySet())
     {
    	 System.out.println(a.getKey()+""+a.getValue());
     }
	}

}
