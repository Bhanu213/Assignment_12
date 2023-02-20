package org.antwalk.model;

public class Valentine {
	String date;
	String gifts;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGifts() {
		return gifts;
	}
	public void setGifts(String gifts) {
		this.gifts = gifts;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	String location;
	public Valentine(String date, String gifts, String location) {
		super();
		this.date = date;
		this.gifts = gifts;
		this.location = location;
	}
	public Valentine() {
		
	}
}
