package Problem5;

public class Time implements Comparable<Time> {
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
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	} 
	
	@Override
    public int compareTo(Time o) {
        if (this.hour != o.hour) return Integer.compare(this.hour, o.hour);
        else if (this.minute != o.minute) return Integer.compare(this.minute, o.minute);
        return Integer.compare(this.second, o.second);
    }
}
