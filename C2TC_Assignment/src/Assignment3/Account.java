package Assignment3;
 public abstract class Account {
	 protected String accountHolder;
	    protected double balance;

	    public Account(String accountHolder, double balance) {
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	        Bank.incrementAccounts(); // Increment totalAccounts
	    }

	    // Abstract methods
	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Common method
	    public void displayAccountDetails() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Current Balance: ₹" + balance);
	    }
}
