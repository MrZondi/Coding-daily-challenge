/**
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate and then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 12% for gratuity rate, the program displays R1.2
 * as gratuity and R11.2 as total.
 * @author Sbulelo
 *
 */
import java.util.Scanner;
public class FinacialApplication {

	public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("Enter the subtotal and the gratuity rate: ");

	int _subtotal = userInput.nextInt();
	float _gratuity = userInput.nextInt();
	
	float _gratuityrate = _gratuity/_subtotal;
	float _total = (float) (_subtotal + _gratuityrate);
	System.out.print("The gratuity is: R"+ _gratuityrate+ " and the total is: R"+ _total);

	}

}
