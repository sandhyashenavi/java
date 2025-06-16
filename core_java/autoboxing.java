package core_java;

public class autoboxing {
	

	public static void main(String[] args) {
		int r=90;
		float area=90.40F;
		char letter='t';
		
		Integer ii=new Integer(r);
		
		Integer jj=new Integer(78);//unboxing
		int a=jj.intValue();
		
		Float ff=new Float(area);
		
		Float f2=new Float(45.20F);//unboxing
		float s=f2.floatValue();
		
		System.out.println("Integer value=" +ii);
		System.out.println("float value=" +ff);
		
	}

}
