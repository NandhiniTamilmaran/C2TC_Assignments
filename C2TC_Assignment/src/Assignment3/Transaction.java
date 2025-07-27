package Assignment3;

public class Transaction {
	 private final double transactionFee = 10.0;

	    public final void performTransaction(Account account, String type, double amount) {
	        System.out.println("\nPerforming " + type + " transaction...");

	        switch (type.toLowerCase()) {
	            case "deposit":
	                account.deposit(amount);
	                break;
	            case "withdraw":
	                account.withdraw(amount + transactionFee); // add fee
	                System.out.println("Transaction fee of ₹" + transactionFee + " applied.");
	                break;
	            default:
	                System.out.println("Invalid transaction type.");
	        }

	        System.out.println("Transaction completed. Updated Balance: ₹" + account.getBalance());
	    }
	
}
