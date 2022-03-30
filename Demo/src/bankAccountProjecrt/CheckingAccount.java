package bankAccountProjecrt;

public class CheckingAccount extends BankAccount{

	public CheckingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
		transactionCount=0;
	}

	private static int transactionCount;
	private static final int numFree=3;
	private static final double transFee=2.0;
	
	
	
	public void deductFees() {
		if(transactionCount>numFree) {
			double fees=transFee*(transactionCount-numFree);
			String str=super.withdraw(fees);
			if(str.equals("withdraw successfully...!")) {
				transactionCount=0;
				System.out.println("deduct fees call");
			}
		}
		//return "";
	}
	
	public String deposit(double amount) {
		if(super.deposit(amount).equals("deposit successfull...!")) {
			transactionCount++;
		
		}
	
		return "";
		
	}
	
	public String withdraw(double amount) {
		if(super.withdraw(amount).equals("withdraw successfully...!")) {
			transactionCount++;
		}
		
		return "";
	}
	
	
}
