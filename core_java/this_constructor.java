package core_java;

public class this_constructor {
	public this_constructor() {
		System.out.println("default constructor");
	}
	public this_constructor(int a)
	{
		this();
		System.out.println("a=" +a);
	}

	public static void main(String[] args) {
	this_constructor tc=new this_constructor(10);	
	}

}
