package collections;

import java.util.ArrayList;

public class searching_fruits {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Orange");
		al.add("Grapes");
		al.add("Pineapple");
		
		if(al.contains("Apple"))
		{
			System.out.println("Record is Found");
		}
		else
		{
			System.out.println("Record is not Found");
		}
	}

}
