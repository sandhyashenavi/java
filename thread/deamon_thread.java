package thread;

public class deamon_thread extends Thread {
public void run()
{
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("Deamon Thread calling");
	}
	else
	{
		System.out.println("User Thread is work calling");
	}
}
	public static void main(String[] args) {
		deamon_thread d1=new deamon_thread();
		deamon_thread d2=new deamon_thread();
		deamon_thread d3=new deamon_thread();
		d2.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}
		
}
