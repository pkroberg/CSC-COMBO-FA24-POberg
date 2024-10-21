import java.util.Scanner;

public class ifAndScanner {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int low = 0;
		int med = 0;
		int high = 0;

		System.out.print("Enter three intigers: ");
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();

		if (num1 > num2) {
			high = num1;
		}

		
		
		
//		String str1 = "";
//		String str2 = "";
//		int alpha;
//		
//		System.out.println("Enter two values: ");
//		str1 = scnr.next();
//		str2 = scnr.next();
//		
//		alpha = str1.compareTo(str2);
//		
//		if (alpha < 0) {
//            System.out.println(str1 + " comes before " + str2);
//        } else if (alpha > 0) {
//            System.out.println(str2 + " comes before " + str1);
//        } else {
//            System.out.println(str1 + " and " + str2 + " are the same.");
//        }
	}

}
