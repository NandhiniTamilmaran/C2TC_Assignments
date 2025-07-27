package Assignment3;

public class CheckingAccount extends Account{
	private static final double OVERDRAFT_LIMIT = 1000;

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited in Checking.");
    }

    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Checking.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
