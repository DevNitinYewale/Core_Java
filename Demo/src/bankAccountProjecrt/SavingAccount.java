package bankAccountProjecrt;

public class SavingAccount extends BankAccount{

	private double interestRate;
	
	//1. Parameterize constructor inherited from parent BankAccount Class
	public SavingAccount(String accountNumber, String accountName,double interestRate ) {
		super(accountNumber, accountName);
		this.interestRate=interestRate;
	}
	
	//2. addInterest
	public double addInterest() {
		return getBalance()*interestRate/100;
		
	}
	
	//3. Parameterize constructor inherited from parent BankAccount Class
	public SavingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return super.getAccountName();
	}

	public String getAccountNumber() {
		return super.getAccountNumber();
	}
	
	public double getBalance() {
		return super.getBalance();
	}
	
	public String deposit(double amount) {
		return super.deposit(amount);
	}
	
	public String withdraw(double amount) {
		return super.withdraw(amount);
	}
	
}