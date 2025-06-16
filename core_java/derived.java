package core_java;

class parent
{
	void show()
	{
		System.out.println("this is a parent class");
	}
}
 class base extends parent
{
	 void accept() 
	 {
	System.out.println("this is a base class");	

	 }
}
public  class derived extends base 
{
	private void display()
	{
		System.out.println("this is a derived class");
	}
	public static void main(String[] args) 
	{
	derived	d=new derived();
	d.accept();
	d.display();
	d.show();
	}

}
