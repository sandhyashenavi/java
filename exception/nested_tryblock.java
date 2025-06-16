package exception;

public class nested_tryblock {

	public static void main(String[] args) {
		try {
			String s=null;
		     System.out.println(s.length());
			try {
				int t=10/2;
				System.out.println("t=" +t);
				
			} catch (Exception e) {
				System.out.println(e);
		}
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
