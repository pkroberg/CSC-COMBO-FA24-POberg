import java.util.Random;
import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scnr = new Scanner(System.in);
		
		int high;
		int low;
		int unevenNums = 0;
		int maxUnevenNums = 0;
		int totalUnevenNums = 0;
        double average = 0.0;
		
        System.out.print("Enter your range of numbers: ");
        low = scnr.nextInt();
        high = scnr.nextInt();
		System.out.println("How many times would you like to run the program?");
		int runtime = scnr.nextInt();
		
		for (int i = 0; i < runtime; i++) {	
		
			int randNum = rand.nextInt(high - low) + low;
			int randNum2 = rand.nextInt(high - low) + low;
			unevenNums = 0;

			while (randNum != randNum2) {
				unevenNums++;
				randNum = rand.nextInt(high - low) + low;
				randNum2 = rand.nextInt(high - low) + low;
			}
			
			totalUnevenNums += unevenNums;
			
			if (unevenNums > maxUnevenNums) {
                maxUnevenNums = unevenNums;
            }
			
			if (unevenNums > maxUnevenNums) {
                maxUnevenNums = unevenNums;
            }
			
		
			System.out.println("Equal Numbers: " + randNum + " " + randNum2);
			System.out.println("Took " + unevenNums + " tries!");
		}
		
		if (runtime > 0) {
            average = (double) totalUnevenNums / runtime;
        }
		System.out.println();
		System.out.println("Max uneven pairs: " + maxUnevenNums);
		System.out.println("Average number of tries: " + average);

	}

}
