package Practice2;

class Time {
	private int hour, minute, second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void toUniversal() {
		
		System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
	}
	
	public void toStandard() {
		int standHour = this.hour % 12;
		if (standHour == 0) {
	        standHour = 12;
	    }
		
		String period = (hour < 12) ? "AM" : "PM";
		
		System.out.printf("%02d:%02d:%02d %s%n", standHour, minute, second, period);
	}
	
	public void add(Time time) {
		int newSecond = (second + time.second) % 60;
		int allMinute = minute + time.minute + (second + time.second - newSecond) / 60;
		int newMinute = allMinute % 60;
		int newHour = ((hour + time.hour) + (allMinute - newMinute) / 60) % 24;

		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
		
		
	}
}

public class Problem3 {

	public static void main(String[] args) {
		
		Time t = new Time(23, 5, 6);
		t.toUniversal();
		t.toStandard();
		Time t2 = new Time(4, 24, 33);
		t.add(t2);
		t.toUniversal();

	}

}
