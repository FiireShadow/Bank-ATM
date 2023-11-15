package bank;

public class Account {
	
	private int accountNumber;
	private String accountName;
	protected float balance;
	
	public Account (int num, String name, float b) {
		this.accountNumber=num;
		this.accountName=name;
		this.balance=b;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		if (balance>0) {
			balance-=amount;
			System.out.println("Transaction successful. $" + amount + " withdrawn.");
		}
		else {
			System.out.println("Transaction failed. Insufficient funds.");
		}
	}
	
	public void deposit(int amount) {
		if (amount>=0) {
			balance+=amount;
			System.out.println("Transaction successful. $" + amount + " deposited.");
		}
		else {
			System.out.println("Deposit failed. Amount is below $0");
		}
	}
	
	public String toString() {
		return accountName + " : " + accountNumber + "\n" + "$" + balance;
	}

}
