package walllet;

import wallet.ui.CustomerWallet;
import wallet.ui.HashMap;
import wallet.ui.Map;
import wallet.ui.Set;
import wallet.ui.WalletUi;
import wallet.ui.Walletui;
import wallet.ui.string;

public class WalletUi {
	public static void main(string[] args) {
		WalletUi ui = new Walletui();
		ui.execute();
	}
	
	Map<String,CustomerWallet> store = new HashMap<>();
	
	public void execute() {
		CustomerWallet w1= new CustomerWallet("1234","Aman",1000);
		CustomerWallet w2= new CustomerWallet("1235","Dhruv",5000);
		store.put("1234", w1);
		store.put("1235", w2);
		w1.addSalary(w2,400);
		print();
		CustomerWallet fetched = findbyId("1234");
		System.out.println(fetched.getName());
	}
	
	public String findbyId(String str) {
		CustomerWallet e = store.getPhoneNo();
		return e;
	}
	
	public void print() {
		Set<Integer> keys=store.keySet();
		for (Integer id : keys) {
			CustomerWallet e = store.get(id);
			System.out.println("phoneNo : "+e.getPhoneNo +" "+"Name "+ e.getName() +" "+e.getBalance());
		}
	}
}
