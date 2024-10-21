
public class Time {

	private int hour;
	private int minute;
	private double seconds;
	
	public Time() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.seconds = 0;
	}
	
	public Time(int hour, int minute, double seconds) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSeconds() {
		return seconds;
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

	public static void convert(Time time) {
		if(time.getHour() > 12) {
			time.setHour(time.getHour() - 12);
		}
	}
	
	public int difference(Time otherTime) {
		return this.getHour() - otherTime.getHour();
	}
	
	@Override
	public String toString() {
		String str = "Time: ";
		str += hour;
		str += ":";
		if(minute < 10) {
			str += "0";
		}
		str += minute;
		str += ":";
		if(seconds < 10) {
			str += "0";
		}
		str += seconds;
		
		return str;
	}

	
	
}
