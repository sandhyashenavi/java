package collection;

import java.util.ArrayList;

public class array_list_demo2 {
 private  int id;
 private String name;
     
	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public static void main(String[] args) {
		array_list_demo2 d2=new array_list_demo2();
		d2.setId(1);
		d2.setName("Sandhya");
		array_list_demo2 d3=new array_list_demo2();
		d3.setId(2);
		d3.setName("Rasika");
		ArrayList<array_list_demo2> al=new ArrayList<array_list_demo2>();
		al.add(d2);
		al.add(d3);
        
        
        System.out.println(al);
        for(array_list_demo2 i:al)
        {
        	System.out.println(i.getId());
        	System.out.println(i.getName());
        }
	}

}
