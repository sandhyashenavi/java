package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class namecomparator implements Comparator
{
    @Override
	public int compare(Object o1, Object o2) {
		sorting_comparator n=(sorting_comparator)o1;
		sorting_comparator n1=(sorting_comparator)o2;
		return n.name.compareTo(n1.name);
	}
}
class agecomparator implements Comparator
{
    @Override
	public int compare(Object o1, Object o2) {
		sorting_comparator n=(sorting_comparator)o1;
		sorting_comparator n1=(sorting_comparator)o2;
		if(n.age==n1.age)
		{
			return 0;
		}
		else
		{
			if(n.age>n1.age)
			{
				return 1;
			}
		}
		return -1;
	}

}
class rollnocomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		sorting_comparator n=(sorting_comparator)o1;
		sorting_comparator n1=(sorting_comparator)o2;
		if(n.rollno==n1.rollno)
		{
			return 0;
		}
		else
		{
			if(n.rollno>n1.rollno)
			{
				return 1;
			}
		}
		return -1;
	}
}
	
public class sorting_comparator {
      int rollno;
      int age;
      String name;
      public sorting_comparator(int r1,int a1,String n1)
      {
    	  this.rollno=r1;
    	  this.age=a1;
    	  this.name=n1;
      }
	public static void main(String[] args) {
		sorting_comparator s1=new sorting_comparator(10, 40, "Sachin");
        sorting_comparator s2=new sorting_comparator(18, 32, "Virat");
        sorting_comparator s3=new sorting_comparator(45, 32, "Rohit");
        sorting_comparator s4=new sorting_comparator(7, 35, "MSD");
        sorting_comparator s5=new sorting_comparator(60, 18, "Sandhya");
        
        ArrayList<sorting_comparator> al=new ArrayList<sorting_comparator>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);
        
       System.out.println("Age Comparator");
        Collections.sort(al,new agecomparator());
        for(sorting_comparator w:al) {
        	System.out.println(w.rollno+"\t"+w.age+"\t"+w.name);
	}
        
        System.out.println("Name Comparator");
        Collections.sort(al,new namecomparator());
        for(sorting_comparator w:al) {
        	System.out.println(w.rollno+"\t"+w.age+"\t"+w.name);
	}
        System.out.println("Rollno Comparator");
        Collections.sort(al,new rollnocomparator());
        for(sorting_comparator w:al) {
        	System.out.println(w.rollno+"\t"+w.age+"\t"+w.name);
	}

}
}


