package collections;

import java.util.ArrayList;
import java.util.Collections;

public class searching_operation1 implements Comparable<searching_operation1>
{
	int rollno;
	String name;
	int age;
	public searching_operation1(int r,String n,int a)
	{
		this.rollno=r;
		this.name=n;
		this.age=a;
	}
      
	public static void main(String[] args) {
		searching_operation1 so=new searching_operation1(60, "Sandhya", 18);
		searching_operation1 so2=new searching_operation1(41, "Rasika", 18);
		searching_operation1 so3=new searching_operation1(2, "Rajni", 20);
		searching_operation1 so4=new searching_operation1(18, "Shambhi", 18);

		ArrayList<searching_operation1> al=new ArrayList<searching_operation1>();
		al.add(so);
		al.add(so2);
		al.add(so3);
		al.add(so4);
		
		Collections.sort(al);
		System.out.println(al);
		for(searching_operation1 i:al)
		{
			System.out.println(i.rollno +"\t"+ i.name +"\t"+ i.age);
		}
	}

	@Override
	public int compareTo(searching_operation1 s) {
		
		return this.name.compareTo(s.name);
	}

}
