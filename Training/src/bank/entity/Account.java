package bank.entity;

public class Account {
	
	public int AccountNo;
	public String name;
	public double balance;
	//public double TransferAmt;
	
	public Account(){		
	}
	
	public Account(int accountNo, String name, double balance) {
		AccountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void UpdateAccount1(double salary) {
		balance+=salary;
	}

	//a1= new Account();
	
	public void transfer(Account ac1,double amt) {
		//Account ac= new Account();
		if(this.balance >= amt) {
			ac1.UpdateAccount1(amt);
			balance-=amt;
		}		
	}
}
