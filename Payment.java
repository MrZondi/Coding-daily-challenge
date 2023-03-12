import java.util.Scanner;

/**
 * The load payment system.
 * It takes in 3 user input interest rate, loan amount, and number of years
 * Computes the monthly payment and the total loan payment
 * Displays the total and monthly loan payment
 * @author Sbulelo
 *
 */
public class Payment {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		//prompt user for interest rate
		System.out.print("Ente the interest rate: ");
		double interest_rate = userInput.nextDouble();
		
		double monthly_rate = interest_rate / 1200; 
		//prompt user
		System.out.print("Enter the loan amout: ");
		double loan_amount = userInput.nextDouble();
		//prompt user
		System.out.print("Enter the number of years for which payment will be made: ");
		int number_years = userInput.nextInt();
		
		//compute the monthly payment amount
		double monthly_payments = loan_amount * monthly_rate / 1 / (1- 1/Math.pow(1 + monthly_rate,number_years*12));
		
		//compute the total loan payment
		double total_payment = monthly_payments * number_years * 12;
		//Display the total and monthly payment
		System.out.println("The monthly payment is: R" + monthly_payments);
		System.out.println("The total payment is: R" + total_payment);

	}

}
