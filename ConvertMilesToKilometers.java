import java.util.Scanner;

/**
 * (Convert mile to kilometer) Write a program that reads a mile in a double value
 * from the console, converts it to kilometers, and displays the result.
 * @author Sbulelo
 *
 */
public class ConvertMilesToKilometers {
	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter miles: ");
		
		int miles = (int)user_input.nextDouble();
		
		double convert =(double) (miles * 1.6);
		
		System.out.print(miles + " miles is " + convert +" kilometers");

	}

}
