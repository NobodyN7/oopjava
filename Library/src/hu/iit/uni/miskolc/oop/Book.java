package hu.iit.uni.miskolc.oop;

public class Book {
	private String title;
	private String author;
	private int releaseYear;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void raisePrice(int percentage){
		price*=(1+percentage/100.0);
	}
	@Override
	public String toString() {
		return "Title = " + title + ", author = " + author + ", releaseYear = " + releaseYear + ", price = " + price;
	}
	
	
	
	
}
