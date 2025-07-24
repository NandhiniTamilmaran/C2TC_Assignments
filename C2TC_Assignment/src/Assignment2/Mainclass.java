package Assignment2;
import java.util.Scanner;
public class Mainclass {
	 public static void main(String[] args) {
	      
	        Student s = new Student();

	        Commission emp = new Commission();
 
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Name: ");
	        emp.setName(sc.nextLine());

	        System.out.print("Enter Address: ");
	        emp.setAddress(sc.nextLine());

	        System.out.print("Enter Phone Number: ");
	        emp.setPhone(sc.nextLong());

	        System.out.print("Enter Sales Amount: ");
	        emp.setSalesAmount(sc.nextDouble());

	        
	        double commission;
	        double amount = emp.getSalesAmount();

	        if (amount >= 100000) {
	            commission = amount * 0.10;
	        } else if (amount >= 50000) {
	            commission = amount * 0.05;
	        } else if (amount >= 30000) {
	            commission = amount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Commission for " + emp.getName() + " is: ₹" + commission);
	    }
}
