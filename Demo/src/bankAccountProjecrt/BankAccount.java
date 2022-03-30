package bankAccountProjecrt;

public class BankAccount {

	private String accountName,accountNumber;
	private static double balance=10000;
	
	public BankAccount(String accountNumber,String accountName) {
		this.accountName=accountName;
		this.accountNumber=accountNumber;
	}
	//1 getAccountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	//2 get AccountName
	public String getAccountName() {
		return accountName;
	}
	//3 getBalance
	public double getBalance() {
		return balance;
	}
	
	//4. deposit
	public String deposit(double amount) {
		if(amount>0) {
			//System.out.println("deposit successfull...!");
			balance+=amount;
			return "deposit successfull...!";
		}
		else { 
			//System.out.println("please enter valid input");
			return "please enter valid input";
		}
	}
	
	//5 Withdraw
	public String withdraw(double amount) {
		if(amount>balance) {
			//System.out.println("insuffecient balance");
			return "insuffecient balance";
		}
		else {
			balance-=amount;
			//System.out.println("withdraw successfully...!");
			return "withdraw successfully...!";
		}
		
	}
}
