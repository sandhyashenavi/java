package collection;

import java.util.Hashtable;
import java.util.Map;

public class hash_table {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(10, "Sachin");
		ht.put(20, "Sharvari");
		ht.put(30, "Mayuri");
		ht.put(40, "Sandhya");
	    ht.put(50, "Rasika");
		System.out.println(ht);
		for(Map.Entry a:ht.entrySet())
		{
			System.out.println(a.getKey()+""+a.getValue());
		}

	}

}
