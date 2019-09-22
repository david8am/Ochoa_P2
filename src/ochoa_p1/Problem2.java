package ochoa_p1;
import java.util.Scanner;
public class Problem2 {
	public static void main(String[] args) {
		
		System.out.println("Please enter four single digit integers: ");
		
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();		
		
		
		
		int temp1 = (num1 + 7) % 10;
		int temp2 = (num2 + 7) % 10;
		int temp3 = (num3 + 7) % 10;
		int temp4 = (num4 + 7) % 10;
		
		// swap first with third digit
		int temp = temp1;
		temp1 = temp3;
		temp3 = temp;
		
		//swap second and fourth
		int temps = temp2;
		temp2 = temp4;
		temp4 = temps;
		
		System.out.println(temp1 + "" + temp2 + "" + temp3 + "" + temp4);
	}
	
		

}
