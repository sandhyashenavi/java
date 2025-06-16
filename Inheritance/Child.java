package Inheritance;

 class Parent
{
 
	 String name="Virat";
	void m()
	{
		System.out.println("Name="+name);
	}
	
}
public class Child extends Parent{
	int id=18;
	void n()
	{
		System.out.println("ID="+id);
	}

	public static void main(String[] args) {
		Parent c=new Child();//upcasting
		c.m();
		
		Child b=(Child)c;//downcasting
		b.m();
		b.n();
	}

}
