package bank.ui;

import bank.entity.Account;

public class CustomerInfo{
	
	public void DisplayInfo(Account[] obj) {
		for(Account a:obj) {
			System.out.println(a.name +" "+a.balance);
		}
	}
	public static void main(String[] args) {
	
	Account data[]=new Account[2];
	data[0]=new Account(1,"A",5000);
	data[1]=new Account(2,"B",6000);
	
	data[0].UpdateAccount(500);
	data[1].UpdateAccount(3000);
	
	CustomerInfo c = new CustomerInfo();
	c.DisplayInfo(data);
	
	}
}
