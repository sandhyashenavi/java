interface A
{
	void show();
}
interface B
{
    void accept();	
}

public class Derived implements A,B{

	public static void main(String[] args) {
	Derived d=new Derived();
	d.accept();
	d.show();
  
	}

	@Override
	public void accept() {
		
	System.out.println("Hello");	
	}

	@Override
	public void show() {
		
	System.out.println("Welcome");	
	}

}
