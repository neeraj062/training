package wallet.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


import wallet.entity.CustomerWallet;

public class CustomerWalletMain {

	public static void main(String[] args) {
		 CustomerWalletMain cust = new CustomerWalletMain();		
			cust.execute();
	}
	
	private Map<String,CustomerWallet> store =new HashMap<>();
	public void execute() {
		CustomerWallet c1 = new CustomerWallet("729834","Aman",49990);
		CustomerWallet c2 = new CustomerWallet("1837814","Neeraj",48920);
		c1.addBalance(500);
		c2.addBalance(1000);
		store.put(c1.getMobileNo(),c1);
		store.put(c2.getMobileNo(),c2);
		print();
		CustomerWallet fetched =findByMobileNo("1837814");
		System.out.println("Details:"+fetched.getName()+" "+fetched.getMobileNo()+" "+fetched.getBalance());
		c1.transferMoney(c2, 400);
		print();
	}
	
	public void print() {
		Set <String> keys =store.keySet();
		System.out.println("Customer Wallet Details:");
		for(String mobileNo: keys) {
			CustomerWallet e= store.get(mobileNo);			
			System.out.println(e.getName()+" "+e.getMobileNo()+" "+e.getBalance());
		}
		System.out.println();
	}
	
	public CustomerWallet findByMobileNo(String mobileNo) {
		CustomerWallet e=store.get(mobileNo);
		return e;
	}

}