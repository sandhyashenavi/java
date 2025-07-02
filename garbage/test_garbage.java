package garbage;

public class test_garbage {
     void show2()
     {
    	 System.out.println("Garbage collection");
     }
     public void finalize()
     {
    	 System.out.println("After Garbage Collection we have to method");
     }
	public static void main(String[] args) {
		test_garbage tg=new test_garbage();
		tg.show2();
		tg=null;
		//tg.show2();
		System.gc();
	}

}
