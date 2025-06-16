package core_java;

public class constructor {
	int s;
	constructor(int i)
	{
	s=i;
	}
	public static void main(String[] args) {
		constructor c=new constructor(45);
		System.out.println(c.s);
		
		
	}

}
