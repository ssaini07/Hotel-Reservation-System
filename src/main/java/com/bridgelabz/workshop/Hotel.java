package com.bridgelabz.workshop;

public class Hotel {

	public String hotelName;
	private int weekdayRegularRate;
	private int weekendRegularRate;

	// creation of Constructor of Hotel class

	public Hotel(String hotelName, int weekdayRegularRate, int weekendRegularRate) {
		super();// for calling parent class
		this.hotelName = hotelName;
		this.weekdayRegularRate = weekdayRegularRate;
		this.weekendRegularRate = weekendRegularRate;
	}

	// creation of getter setter
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getWeekdayRegularRate() {
		return weekdayRegularRate;
	}

	public void setWeekdayRegularRate(int weekdayRegularRate) {
		this.weekdayRegularRate = weekdayRegularRate;
	}

	public int getWeekendRegularRate() {
		return weekendRegularRate;
	}

	public void setWeekendRegularRate(int weekendRegularRate) {
		this.weekendRegularRate = weekendRegularRate;
	}

}
