package ochoa_p3;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		String topic[] = {"Champions League", "NBA", "FIFA 20", "Immigration", "Pizza"};
		int numRatings[][] = new int[5][10];
		int ratings[][] = new int[5][5];
		
		for(int x = 0; x<5; x++) {
			for(int z = 0; z<10; z++) {
				numRatings[x][z] = 0;
			}
		}

		//Prompt user input
		for(int i=0;i<5;i++){
			System.out.println("Pick Rating 1-10");
			for(int j=0;j<5;j++){

				System.out.print(" User Rating " +(j+1) + " Topic "+ topic[i] +" : ");
				ratings[i][j]=input.nextInt();
			
			}
			System.out.println("");
		}
		
		Double avg[] = new Double[topic.length];
		int total[] =  new int[topic.length];
		
		//Get total ratings for each topic
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j<5; j++) {
				total[i] += ratings[i][j];
			}


		}   
	
		int high = total[0];
		int low  = total[0];
		String lowest = topic[0];
		String highest = topic[0];
		//find min and max 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<5; j++) {

				if(i+1 != 5 && total[i +1]< low) {
					lowest = topic[i+1];
					low = total[i+1];
				}else if(i +1 != 5 && total[i+1] > high) {
					high = total[i+1];
					highest = topic[i+1];
					
				}
			}

		}
		//find avg
		for(int i = 0; i< 5; i++) {
			avg[i] = total[i]/5.0;
		}
		
	
		
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s %10s", " ", "1", "2", "3", "4", "5", "6", "7", "8","9", "10", "Average");
		
		for(int i = 0; i<5 ; i++) {
		
				
			System.out.println();
			

						System.out.printf("%10s  %10s  %10s  %10s  %10s  %10s  %10s  %10s  %10s  %10s  %10f ", topic[i],"","","","","","", "","","", avg[i]);	
		}
		
		System.out.println();
		//print highest and lowest
		System.out.println("Highest point total: " + highest + " " + high + " points");
		System.out.println("Lowest point total: " + lowest + " " + low + " points");

	}
}
