import java.util.Scanner;

public class employee {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter employee name:");
	String name=sc.next();
	
	System.out.println("enter monthly salary:");
	String salstr=sc.next();
	
	Double salary=Double.valueOf(salstr);
	double yearlySalary=salary*12;
	
	System.out.println("Employee name:"+name);
	System.out.println("yearly salary:"+yearlySalary);
	sc.close();

	}

}
