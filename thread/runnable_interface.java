package thread;

public class runnable_interface implements Runnable{

	public static void main(String[] args) {
		runnable_interface r=new runnable_interface();
		Thread t=new Thread(r);
         t.start();
	}

	@Override
	public void run() {
	System.out.println("method override");	
		
	}

}
