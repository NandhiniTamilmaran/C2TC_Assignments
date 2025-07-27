package Assignment3;

public class Bankingdemo {
public static void main(String[] args) {
	 Account s1 = new SavingAccount("Nandhini", 5000);
     Account c1 = new CheckingAccount("Thubiksha", 3000);

     // Display account info
     System.out.println("\n--- Savings Account Info ---");
     s1.displayAccountDetails();

     System.out.println("\n--- Checking Account Info ---");
     c1.displayAccountDetails();

     // Perform transactions
     Transaction t = new Transaction();
     t.performTransaction(s1, "deposit", 1000);
     t.performTransaction(c1, "withdraw", 3500);

     // Display updated account info
     System.out.println("\n--- Updated Savings Account Info ---");
     s1.displayAccountDetails();

     System.out.println("\n--- Updated Checking Account Info ---");
     c1.displayAccountDetails();

     // Show total accounts
     System.out.println("\nTotal Bank Accounts Created: " + Bank.getTotalAccounts());
 }
}


