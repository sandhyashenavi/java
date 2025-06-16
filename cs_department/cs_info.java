package cs_department;

public class cs_info {
	String name;
	int strength;
	public cs_info(String n,int s)
	{  
		name=n;
		strength=s;
		
	}
   public void show1()
	{
	System.out.println("Information about computer department ");
	System.out.println("Student name:"+name);
	System.out.println("Student rollno:"+strength);
	}
	

	public static void main(String[] args) {
		//cs_info cs=new cs_info("sandhya", 60);
		
		
	}

}
