package String;

public class Product {

	public static void main(String[] args) {
	 char c[]= {'H','e','l','l','o'};
	 String s=new String(c);
	 System.out.println(c);
	 
	 String s1="Hello";//literal string
	 String s2=new String("Sandhya");//by using new keyword
	 String s3="java";
	 String s4=new String("Hello");
	 String s5="Sandhya";
	 String s6="Java";
	 String s7="java";
	 
	 System.out.println(s1==s4);
	 System.out.println(s2==s5);
	 System.out.println(s3==s7);
	 
	 System.out.println("by using equal method...");
	 System.out.println(s1.equals(s4));
	 System.out.println(s2.equals(s5));
	 System.out.println(s3.equals(s6));
	 System.out.println(s3.equalsIgnoreCase(s6));
	 
	 System.out.println("calling to compared method");
	 System.out.println(s1.compareTo(s4));
	 System.out.println(s2.compareTo(s6));
	 System.out.println(s3.compareTo(s6));
	 
	 System.out.println(s1.trim());
	 
	 String s9=" Welcome to VVIT pal ";
	 String s10[]=s9.split(" ");
	 for(String a:s10)
	 {
		 System.out.println(a);
	 }
	 
	 String m="hello";
	 String n=new String("hello").intern();
	 System.out.println(m==n);
	 
	 System.out.println(m.contains("hi"));
	 
	 String x="hello";
	 x=x.concat(s6);
	 System.out.println(x);
	 
	 StringBuffer sb=new StringBuffer("hello ");
	 sb.append("world");
	 System.out.println(sb);
	 
	}
}
