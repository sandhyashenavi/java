package core_java;

public class this_function {
	void show()
	{
		System.out.println("calling show");
	}
	void display()
	{
		this.show();
		System.out.println("calling display");
	}

	public static void main(String[] args) {
		this_function tf=new this_function();
		tf.display();
	}

}
