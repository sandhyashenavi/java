import java.util.*;
public class account {
	int balance=0;
	int wd;
	int sum;
	Scanner sc=new Scanner(System.in);
	public void deposit()
	{
		System.out.println("enter balance"+balance);
		balance=sc.nextInt();
		System.out.println("enter withdrawal:"+wd);
		wd=sc.nextInt();
		sum=balance-wd;
		if(sum==balance)
		{
		System.out.println("balance remains same:");
		}
		else
		{
		System.out.println("balance remaining value:"+sum);
		}
	}
     
	public static void main(String[] args) {
		account ac=new account();
		ac.deposit();
	}

}
