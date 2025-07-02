package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sorting_operation_collections {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(15);
		a1.add(45);
		a1.add(18);
		a1.add(60);
		
		Collections.sort(a1);
		System.out.println(a1);
		Iterator<Integer> i1=a1.iterator();
		while (i1.hasNext()) {
			
			System.out.println(i1.next());

		}
	}

}
