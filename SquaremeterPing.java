import java.util.Scanner;
/**
 * Convert square meter into ping) Write a program that converts square meter into ping.
 * The program prompts the user to enter a number in square meter, converts it to ping,
 * and displays the result. One square meter is 0.3025 ping
 * @author Sbulelo
 *
 */

public class SquaremeterPing {

	public static void main(String[] args) {
		Scanner squareInput = new Scanner(System.in);
		System.out.print("Enter a number in square meters: ");
		double _square = squareInput.nextDouble();
		double _ping = _square * 0.3025;
		System.out.print(_square + " square a meter is "+ _ping+ " ping");
		}

}
