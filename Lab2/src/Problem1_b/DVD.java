package Problem1_b;

public class DVD extends LibraryItem {
	private int durationInMinutes;
	
	public DVD(String title, String author, int year, int duration) {
		super(title, author, year);
		this.durationInMinutes = duration;
	}
	
	public String getCalculatedDuratuion() {
		int minutes = this.durationInMinutes % 60;
		int hours = (this.durationInMinutes - minutes) / 60;
		
		if (minutes < 10 || hours < 10) {
			if (minutes < 10 && hours < 10) {
				return "0" + hours + ":0" + minutes;
			} else if (minutes < 10) {
				return hours + ":0" + minutes;
			} else {
				return "0" + hours + ":" + minutes;
			}
		}
		else {
			return hours + ":" + minutes;
		}
		
	}
	
	@Override 
	public String toString(){
		return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear of publication: " + getPublicationYear() + "\nDuration of title: " + getCalculatedDuratuion();
	}
}