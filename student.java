
public class student {
	String name;
	int age;
	char grade;
	public student(String n,int a,char g)
	{
		name=n;
		age=a;
		grade=g;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Grade:"+grade);
	}

	public static void main(String[] args) {
		student s1=new student("xyz",20,'A');
		student s2=new student("abc",25,'B');
		student s3=new student("opt",30,'c');
		student s4=new student("htj",35,'A');
		student s5=new student("smd",40,'b');
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();

	}

}
