package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class hash_set_demo {

	public static void main(String[] args) {
		hash_set_demo h=new hash_set_demo();
		HashSet<String> hs=new HashSet<String>();
		hs.add("Sandhya");
		hs.add("Rasika");
		hs.add("Mayuri");
		hs.add("Sandhya");
		System.out.println(hs);
		for(String i:hs)
		{
			System.out.println(i);
		}

	}

}
