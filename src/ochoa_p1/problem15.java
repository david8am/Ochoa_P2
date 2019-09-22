package ochoa_p1;
import java.util.Scanner;
public class problem15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter four single digit integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();		
		
		int temp = num1;
		num1 = num3;
		num3 = temp;
		
		int temp2 = num2;
		num2 = num4;
		num4 = temp2;
		
		num1 = (num1 + 3) % 10;
		num2 = (num2 +3) % 10;
		num3 = (num3 + 3) % 10;
		num4 = (num4 + 3) % 10;
		
		System.out.println(num1 + "" + num2 + "" + num3 + "" + num4);
		
	}

}
