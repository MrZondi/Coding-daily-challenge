import java.util.Scanner;
/**
 * (Convert meters into feet) Write a program that reads a number in meters, converts
 * it to feet, and displays the result. One meter is 3.2786 feet.
 * @author Sbulelo
 *
 */
public class MeterFeet {

	public static void main(String[] args) {
		Scanner meterInput = new Scanner(System.in);
		
		System.out.print("Enter a value for meter: ");
		
		float _meter = meterInput.nextInt();
		
		float _feet =(float) (_meter * 3.2786);
		
		System.out.print(_meter + " meters is "+ _feet+" feets");
		

	}

}
