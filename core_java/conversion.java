package core_java;

public class conversion {

	public static void main(String[] args) {
		String s="10";
		String a="20";
		
		Integer i=Integer.valueOf(s);
		int j=Integer.parseInt(a);
		int add=i+j;
		System.out.println("addition:" +add);
	}

}
