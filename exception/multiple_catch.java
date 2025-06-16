package exception;

public class multiple_catch {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch (Exception e) {
			System.out.println("First block");
			
		}
		catch (Throwable e1) {
			System.out.println("Second block");
			
		}
		
		

	}

}
