package Assignment3;
 public class SavingAccount extends Account{
	 private static final double INTEREST_RATE = 0.03;

	    public SavingAccount(String accountHolder, double balance) {
	        super(accountHolder, balance);
	    }

	    public void deposit(double amount) {
	        balance += amount + (amount * INTEREST_RATE);
	        System.out.println("₹" + amount + " deposited with 3% interest in Savings.");
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("₹" + amount + " withdrawn from Savings.");
	        } else {
	            System.out.println("Insufficient balance in Savings.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
}
