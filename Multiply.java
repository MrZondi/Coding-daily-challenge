import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner intInput = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		
		int _number = intInput.nextInt();
		
		int _mod = _number / 10 % 10;
		int _div = _number / 10;
		int _mod2 = _div % 10;
		
		System.out.print(_mod);

	}

}
