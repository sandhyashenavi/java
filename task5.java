import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String str;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		System.out.println(str);
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("reverse string"+sb);

	}

}
