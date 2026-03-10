package Problem1_b;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;

	public LibraryItem(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.publicationYear = year;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublicationYear(int year) {
		this.publicationYear = year;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	@Override
	public String toString(){
		return "Title: " + this.title + "\nAuthor: " + this.author + "\nYear of publication: " + this.publicationYear;
	}
}