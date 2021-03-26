package bank;

public class Accounts {

	public static void main(String[] args) {
		Account account1= new Account("Mario Conde",20000.5);
		Account account2= new Account("J.L. Barcenas",5000.0);
		
		transfer(account1,account2,30000);
		accountInfo(account1);
		transfer(account1,account2,5000);
		accountInfo(account2);
		personalCredit(account2,40000);
	
	}
	
	public static void transfer(Account acc1, Account acc2, double amount) {
		if (acc1.getBalance()>=amount) {
			acc1.withdrawal(amount);
			acc2.deposit(amount);
			System.out.println(acc1.getOwner()+" has sent a transfer of "+amount+"€ to "+acc2.getOwner());
		}else {
			System.out.println(acc1.getOwner()+" don't has enough money to do the transfer");
		}
	}
	
	public static void personalCredit(Account acc, double amount) {
		acc.deposit(amount);
		System.out.println("The balance of "+acc.getOwner()+" has been increased for a personal credit in "+amount+" €");
		System.out.println("The new balance is: "+acc.getBalance());
	}
	
	public static void accountInfo(Account acc) {
		System.out.println(acc.toString());	
	}

}
