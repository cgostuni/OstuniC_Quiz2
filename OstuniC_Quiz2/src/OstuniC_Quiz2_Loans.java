
import java.util.Scanner;

public class OstuniC_Quiz2_Loans {
	
	
	public static void main(String[] args){

	// create a scanner object
	Scanner input = new Scanner(System.in);
		
	// ask user for the initial cost of tuition
	
	System.out.print("What is the initial cost of tuition?: ");
	// assign users input to "initial_tuit"
	double initial_tuit = input.nextDouble();
	
	
	// ask user for the percent increase of tuition
	
	System.out.print("What is the yearly percent% increase for tuition?: ");
	// assign users input to "increase"
	double increase = input.nextDouble();
	// convert users percent input to a decimal
	double tuit_increase = increase / 100;
	
	
	// calculate the total tuition at the end of the 4 years
		double exp1 = Math.pow((1+ tuit_increase), 4);
		double end_tuit = initial_tuit * exp1;
		
	// tell user the total cost of tuition at the end of 4 years
		System.out.println("Your total tuition at the end of your 4 years of college is $" + end_tuit);
			
	
		
	// ask user for repayment APR for their student loans
	
	System.out.print("What is the anual percentage% rate (APR) for student loans?: ");
	// assign users input to "APR_%"
	double APR_perc = input.nextDouble();
	
	// convert users percent input to a decimal
	double APR = APR_perc / 100;
	// convert users annual decimal rate to monthly decimal rate
	double month_APR = APR / 12;
	
	// ask user for their term of repayment
	System.out.print("How many years of student loan repayment (term) ?: ");
	// assign users input to "term"
	double term = input.nextDouble();
	// convert users anual term to a monthly term of loan repayment
	double monthly_term = term / 12;
	
	
	
	// calculate the monthly payment for student loans
	double exp2 = Math.pow((1 + month_APR), monthly_term);
	double monthly_loan = (month_APR * end_tuit) / (1 - (1 / exp2));
	
	
	// tell user the monthly payment for their student loans
	System.out.println("Your monthly payment for your student loans is $" + monthly_loan);
	
			
	}
}