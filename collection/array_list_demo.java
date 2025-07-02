package collection;

import java.util.ArrayList;

public class array_list_demo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		System.out.println(al);
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}

}
