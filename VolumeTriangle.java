import java.util.Scanner;
/**
 * (Compute the volume of a triangle) Write a program that reads in the length of
 * sides of an equilateral triangle and computes the area and volume using the following formulas:
 * area =sqrt(3)/4*(length of sides)^2
 * volume = area * length
 * @author Sbulelo
 *
 */

public class VolumeTriangle {

	public static void main(String[] args) {
		
		Scanner lengthInput = new Scanner(System.in);
		
		//Prompt user for length
		System.out.print("Enter length of the sides and height of the Equilateral in cm: ");
	
		float _length = (float) lengthInput.nextDouble();
		//Compute area of triangle
		float _area = (float)(Math.sqrt(3)*Math.pow(_length, 2) / 4);
		// Compute volume of a triangle
		float _volume =  (float) (_area * _length) ;
		
		//Output the area and the volume
		System.out.println("The aera of the triangle is: " + _area +"cm^2");
		System.out.println("The volume of the Triangular prism is: " + _volume +"cm^3");
		

	}

}
