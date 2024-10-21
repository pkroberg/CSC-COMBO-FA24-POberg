package tenzie;

import java.util.Random;
import java.util.Scanner;

public class Tenzie {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int p1Games = 0;
		int p2Games = 0;
		char another = 'y';
		
		while (another == 'y') {
			System.out.println("Player 1, enter your number: ");
			int p1Number = scnr.nextInt();
			System.out.println("Player 2, enter your number:");
			int p2Number = scnr.nextInt();
			
			int p1Score = 0;
			int p2Score = 0;
			
			for (int i = 0; i <= 10; i++) {
				Random rand = new Random();
				int compDie = rand.nextInt(6) + 1;
				if (p1Number == compDie) p1Score++;
				if (p2Number == compDie) p1Score++;
				break;
			}
			if (p1Score > p2Score) {
				System.out.println("Player 1 Wins!");
			}
			else if (p1Score < p2Score) {
				System.out.println("Player 2 Wins!");
			}
			else {
				System.out.println("Draw!");
			}
			System.out.println("Would you like to play again? y/n: ");
			another = scnr.nextLine().charAt(another);
			break;
		}
		if (p1Games > p2Games) System.out.println("Player 1 Wins!");
		else if (p1Games < p2Games) System.out.println("Player 2 Wins!");
		else System.out.println("Draw!");
	}

}
