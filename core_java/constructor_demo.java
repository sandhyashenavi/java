package core_java;

public class constructor_demo {
	int a;
	public constructor_demo(int i) {
		a=i;
    System.out.println("value of a:"+a);	
		
	}

	public static void main(String[] args) {
		constructor_demo c=new constructor_demo(45);

	}

}
