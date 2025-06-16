package core_java;

public class this_keyword {
	int a;
	int b;
      public this_keyword(int a,int b)
      {
    	this.a=a;
    	this.b=b;
    	
      }
      void show()
      {
    	  System.out.println(+a);
      	  System.out.println(+b);
      }

	public static void main(String[] args) {
		this_keyword tk=new this_keyword(29,30);
		tk.show();
	}

}
