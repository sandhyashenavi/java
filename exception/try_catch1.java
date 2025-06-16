
package exception;
import java.util.*;
public class try_catch1 {

	public static void main(String[] args) {
		try {
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:" );
			n=sc.nextInt();
			System.out.println(n);
			System.out.println("before exception");
			int m=n/0;
			{
				System.out.println("not divided by zero" +m);
			}
			System.out.println("after exception");
			
			} catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("it is always executed");
			System.exit(0);
			System.out.println("finally block");
		}
		
		
	}

}
