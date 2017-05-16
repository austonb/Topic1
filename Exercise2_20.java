package chapter2;
import java.util.Scanner;

public class Exercise2_20 {
	  private static Scanner input;

	public static void main(String[] args) {
	         
	        //Display Program Information
	        System.out.println("This Program Calculates Interest On The Next Monthly"
	                + " Payment.\n");
	 
	        input = new Scanner(System.in);
	 
	        //prompt user to enter details
	        System.out.print("Enter balance and annual percentage interest rate "
	                + "(e.g., 3 for 3%): ");
	        double balance = input.nextDouble();
	        double annualInterestRate = input.nextDouble();
	 
	        //calculate interest using the formula interest = balance * (annualInterestRate / 1200)
	        double interest = balance * (annualInterestRate / 1200);
	        //format interest to five decimal places
	         interest = (int)(interest * 100000)/100000.0;
	 
	        
	        System.out.println("The interest is " + interest + "\n");
	    }
}
