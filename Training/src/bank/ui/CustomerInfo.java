package bank.ui;
import bank.entity.Account;

public class CustomerInfo{
	
	public void displayInfo(Account[] obj) {
		
		for(Account a:obj) {
			System.out.println("Account Details of "+a.AccountNo);
			System.out.println("Name : "+a.name +"\n"+"Balance : "+a.balance);
		}
		System.out.println("200 Amount is transferred from Herry to Tom");
	}
	
	public static void main(String[] args) {
	
	Account data[]=new Account[2];
	data[0]=new Account(1,"Tom",5000);
	data[1]=new Account(2,"Herry",6000);
	
	CustomerInfo c = new CustomerInfo();
	//data[0].TransferAmt=500;
	
	//Account a = new Account();
	data[1].transfer(data[0],200);
	c.displayInfo(data);
	
	}
}
