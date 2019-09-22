
package ochoa_p2;
import java.util.Scanner;
public class problem2s {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter your weight in kilograms: ");
	double weight = input.nextDouble();
	System.out.println("Please enter your height in centimeters: ");
	double height = input.nextDouble();
	
	double bmi = weight / Math.pow(height/100.0, 2);
	
	System.out.println("Your BMI is: " + bmi);
	
	if(bmi <= 18.5) {
		System.out.println("You are underweight");
	}else if (bmi > 25 && bmi <= 30) {
		System.out.println("You are Overweight ");
	}else if(bmi > 30) {
		System.out.println("You are Obese");
	}else {
		System.out.println("You are Normal Weight");
	}
	
}
}
