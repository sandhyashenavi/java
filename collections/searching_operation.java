package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class searching_operation implements Comparable<searching_operation>{
	int rollno;
	String name;
	int age;
	public searching_operation(int r,String n,int a)
	{
		this.rollno=r;
		this.name=n;
		this.age=a;
	}
      
	public static void main(String[] args) {
		searching_operation so=new searching_operation(60, "Sandhya", 18);
		searching_operation so2=new searching_operation(41, "Rasika", 18);
		searching_operation so3=new searching_operation(2, "Rajni", 20);
		searching_operation so4=new searching_operation(18, "Shambhi", 18);

		ArrayList<searching_operation> al=new ArrayList<searching_operation>();
		al.add(so);
		al.add(so2);
		al.add(so3);
		al.add(so4);
		
		Collections.sort(al);
		System.out.println(al);
		for(searching_operation i:al)
		{
			System.out.println(i.rollno +"\t"+ i.name +"\t"+ i.age);
			
		}
		
	}

	@Override
	public int compareTo(searching_operation o) {
		if(age==o.age)
		{
			return 0;
		}
		else
		{
			if(age>o.age)
			{
				return 1;
			}
		}
		return -1;
	}

}
