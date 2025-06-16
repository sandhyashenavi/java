package office;
import cs_department.*;
import me_department.*;
public class office_info {
	void display()
	{
		System.out.println("Information about office");
	}

	public static void main(String[] args) {
		office_info of=new office_info();
		of.display();
		cs_info cs=new cs_info("sandhya",60 );
		cs.show1();
		me_info me=new me_info("arjun", 50);
		me.accept1();
		
		
	}

}
