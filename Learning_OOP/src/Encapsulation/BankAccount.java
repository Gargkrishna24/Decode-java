package Encapsulation;

public class BankAccount {
	private final String customer;
	private final int  accountNumber;
	private int balance;
	

	public BankAccount(String customer,int accountNumber,int balance) {
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void getCustomerName() {
		System.out.println(this.customer);
	}
	
	public int getAccountNumber() {
		return (this.accountNumber);
	}
	
	public void getAccountBalance() {
		System.out.println("Account Balance : " + this.balance);
	}
	
	public void depositBalance(int balance) {
		if(balance>=0) {
			this.balance+=balance;
			System.out.println("Successfully deposite");

		}else {
			System.out.println("Invalid Balance");
		}
	}

	public void withDraw(int balance) {
		if(balance>0) {
			this.balance-=balance;
			System.out.println("Successfully withdraw");
		}else {
			System.out.println("Invalid Balance");
		}
	}

	static void main(String[] args) {
	BankAccount customer = new BankAccount("Krishna Garg",2215000,0);
	customer.getCustomerName();
	System.out.println(customer.getAccountNumber());
	customer.depositBalance(100);
	customer.withDraw(50);
	customer.withDraw(-100);
	customer.getAccountBalance();
	}


}
