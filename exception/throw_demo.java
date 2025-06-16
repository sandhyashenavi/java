package exception;

public class throw_demo {
     static int age=18;
	
     public static void main(String[] args)throws Exception {
		
         if(age<18)
         {
        	 throw new Exception("Age not valid for voting");
         }
         else
         {
        	 System.out.println("Age valid for voting");
         }
		
	}

}
