package loops;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 10; i++) {
			for (int j = 1; j<= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		
		System.out.println("Enter the word you would like to spell");
		String str1 = input.next();
		System.out.println("Enter the tiles you have");
		String str2 = input.next();
		int count;
		boolean match = true;
		
		for (int i = 0; i < str1.length(); i++) {
			count = 0;
			for(int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
			if (count < 1) {
				System.out.println("A letter is missing");
				match = false;
			}
		}
		if (match) {
			System.out.println("You can spell that word");
		}
		
	}

}
