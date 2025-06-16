package core_java;

public class encapsulation_demo {
	private long accountno;
	private String accname;

	public long getAccountno() {
		return accountno;
	}

	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public static void main(String[] args) {
		encapsulation_demo e=new encapsulation_demo();
		e.setAccountno(45271863);
		e.setAccname("Sandhya");
		System.out.println(e.getAccountno());
		System.out.println(e.getAccname());
	}

}
