import java.util.Scanner;

public class IOChecklist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;

//		System.out.println("Enter 2 words:");
//		word = input.nextLine();
//		System.out.println("Here are the words: " + word);
//	
//		System.out.println("Enter an integer:");
//		intNum = input.nextInt();
//		System.out.println("Here is the integer: " + intNum);
//		
//		System.out.println("Enter an float:");
//		realNum = input.nextFloat();
//		System.out.println("Here is the float: " + realNum);
//		
//		System.out.println("Enter a dollar amount:");
//		biggerRealNum = input.nextDouble();
//		System.out.printf("Here is the dollar amount:" + "$%.2f\n", biggerRealNum);
//		
//		System.out.println("Enter an character:");
//		letter = input.next().charAt(0);
//		System.out.println("Here is the character: " + letter);
		
		realNum = 987654321.987654321f;
		realNum += realNum;
		System.out.printf("$%.9f\n", realNum);
		
		biggerRealNum = 987654321987654321.987654321f;
		biggerRealNum += biggerRealNum;
		System.out.printf("$%.9f\n", biggerRealNum);
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
	}

}
