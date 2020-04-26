package com.khanna.weather.entity;

import java.util.List;

public class Weather {
	private String cityName;
	private String countryName;
	private String sunset;
	private String sunrise;
	private List<DayDetail> dayDetails;

	/**
	 * @return the dayDetails
	 */
	public List<DayDetail> getDayDetails() {
		return dayDetails;
	}

	/**
	 * @param dayDetails the dayDetails to set
	 */
	public void setDayDetails(List<DayDetail> dayDetails) {
		this.dayDetails = dayDetails;
	}

	/**
	 * @return the sunset
	 */
	public String getSunset() {
		return sunset;
	}

	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	/**
	 * @return the sunrise
	 */
	public String getSunrise() {
		return sunrise;
	}

	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weather [cityName=" + cityName + ", countryName=" + countryName + ", sunset=" + sunset + ", sunrise="
				+ sunrise + ", dayDetails=" + dayDetails + "]";
	}
	
	

}
