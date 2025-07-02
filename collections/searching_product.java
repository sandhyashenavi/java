package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class searching_product {

	public static void main(String[] args) {
		
		ArrayList<String> book=new ArrayList<String>();
		book.add("Python");
		book.add("Java");
		book.add("English");
		book.add("Maths");
		
		ArrayList<String> pen=new ArrayList<String>();
		pen.add("Lexi");
		pen.add("Octet");
		pen.add("Cello");
		pen.add("Rorito");
		
		String n;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter Your Choice:");
		n=sc.next();
//		switch (n)
//		{
//		case "book" :
//			System.out.println("Books Collection:");
//			for(String as:book)
//			{
//				System.out.println(as);
//			}
//			break;
//		case "pen" :
//			System.out.println("Pens Collection");
//			for(String al:pen)
//			{
//				System.out.println(al);
//			}
//			break;
//		case "exit" :
//		    System.out.println("Wrong your choice!");
//		    break;
//		
//		}
	
		if(n.contains("book"))
		for(String as:book)
		    {
				System.out.println(as);
			}
			
		else if(n.contains("pen"))
			for(String al:pen)
	         {
					System.out.println(al);
			 }
		else
		{
			System.out.println("Record not found!");
		}
		}
	}
}	
		
