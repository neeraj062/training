package bank.entity;

public class Account {
	
	public int AccountNo;
	public String name;
	public double balance;
	
	public Account(){		
	}
	
	public Account(int accountNo, String name, double balance) {
		super();
		AccountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void UpdateAccount(double salary) {
		balance+=salary;
	}

	//a1= new Account();
	
	public void transfer(Account ac1,double amt) {
		//Account ac= new Account();
		ac1.transfer(ac1, amt);
		
	}
	
}
