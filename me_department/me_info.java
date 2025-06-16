package me_department;

public class me_info {
	String name;
	int strength;
	public  me_info(String n1,int s1)
	{
		name=n1;
		strength=s1;
	}
    public	void accept1()
	{
		System.out.println("Information about mechanical department:");
		System.out.println("Student name:"+name);
		System.out.println("Student rollno:"+strength);
	}
	public static void main(String[] args) {
		//me_info me=new me_info("Arjun", 50);
	

	}

}
