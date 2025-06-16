package core_java;

public class constructor_demo1 {
	int id;
	public constructor_demo1(int i) {
	id=i;
	System.out.println("ID:" +id);
	}

	public constructor_demo1(constructor_demo1 d)
	{
		this(d.id);
	}
	public static void main(String[] args) {
	constructor_demo1 d1=new constructor_demo1(60);
	constructor_demo1 d2=new constructor_demo1(d1);

	}

}
