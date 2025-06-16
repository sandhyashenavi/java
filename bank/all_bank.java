package bank;

import sbi_bank.bank1;
import hdfc_bank.bank2;

public class all_bank {
	void display2()
	{
		System.out.println("Introduction about all bank:");
	}

	public static void main(String[] args) {
		all_bank ab=new all_bank();
		ab.display2();
		bank1 sbi=new bank1(6.8f);
		sbi.accept2();
		bank2 hdfc=new bank2(8.9f);
		hdfc.accept3();}

}
