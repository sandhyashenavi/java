package thread;

public class my_thread extends Thread {
	public void run()
	{
        for(int n=1;n<=5;n++)
        {
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		System.out.println(n);
        }
        System.out.println("Thread calling ");
	}
	public static void main(String[] args) {
		my_thread th=new my_thread();
		my_thread mth=new my_thread();
		th.start();
		mth.start();

	}

}
