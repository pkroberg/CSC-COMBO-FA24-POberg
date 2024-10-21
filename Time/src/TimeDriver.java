import java.util.Scanner;

public class TimeDriver {

	
	public static void main(String[]nargs) {
		Scanner input = new Scanner(System.in);
		Time myTime = new Time(9,45,30.0);
		
		//System.out.println(myTime.toString());
		
		Time newTime = new Time();
		System.out.println("Please enter a tim in 24-hour format" + "i.e 17:00:00.0");
		System.out.println("Enter the hour:");
		int hour = input.nextInt();
		System.out.println("Enter the minutes:");
		int min = input.nextInt();
		System.out.println("Enter the seconds:");
		double sec = input.nextInt();
		
		
		
		newTime.setHour(hour);
		newTime.setMinute(min);
		newTime.setSeconds(sec);
		newTime.convert(newTime);
		
		System.out.println(newTime);
		
		System.out.println(newTime.difference(myTime));
	}
}
