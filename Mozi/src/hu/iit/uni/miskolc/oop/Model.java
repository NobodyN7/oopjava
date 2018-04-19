package hu.iit.uni.miskolc.oop;

import java.util.Arrays;

public class Model implements Film {
	
	private String title;
	private String producer;
	private FilmCategory category;
	private final int year;
	private String characters;
	
	public Model(String title, String producer, FilmCategory category, int year, String characters){
		this.title = title;
		this.producer = producer;
		this.category = category;
		this.year = year;
		this.characters = characters;
			
	}
	
	public Model(Model movie) {
		this.title = movie.getTitle();
		this.producer = movie.getProducer();
		this.category = movie.getCategory();
		this.year = movie.getYear();
		this.characters = movie.getMovieCharacters();
	}

	public String getTitle() {
		return title;
	}

	public String getProducer() {
		return producer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category.toString();
	}

	public void setCategory(FilmCategory category) {
		this.category = category;
	}

	public int getYear(){
		return year;
	}

	public String getMovieCharacters() {
		return characters;
		
	}

	@Override
	public String toString() {
		return "Model [title=" + title + ", producer=" + producer + ", category=" + category + ", year=" + year
				+ ", characters=" + characters + "]";
	}
	
	

}
