package collection;

import java.util.ArrayList;

public class array_list_demo3 {
     int product_id;
     String product_name;
     public array_list_demo3(int a,String n)
     {
    	 product_id=a;
    	 product_name=n;
    	 
    	 System.out.println("id="+product_id);
    	 System.out.println("name="+product_name);
     }
	public static void main(String[] args) {
		array_list_demo3 ald=new array_list_demo3(45,"Rohit");
        ArrayList<array_list_demo3> al=new ArrayList<array_list_demo3>();
        al.add(ald);
       // System.out.println(al);
        for(array_list_demo3 i:al)
        {
        	System.out.println(i.product_id);
        	System.out.println(i.product_name);
        }
	}

}
