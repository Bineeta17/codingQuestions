package com.example.IntegrationTesting.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private long id;
	private String title;
	private String year;
	private String rating;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Movie() {
		
	}
	
	public Movie(long id,String title) {
		
		this.id = id;
		this.title=title;
	}
	
	
	
	

}
