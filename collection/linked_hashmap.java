package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class linked_hashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.putFirst(10, "Sachin");
		lhm.putFirst(18, "Virat");
		lhm.putFirst(45, "Rohit");
		lhm.putFirst(60, "Sandhya");
		lhm.putFirst(28, "Virat");
		System.out.println(lhm);
		for(Map.Entry a:lhm.entrySet())
		{
			System.out.println(a.getKey()+""+a.getValue());
		}

	}

}
