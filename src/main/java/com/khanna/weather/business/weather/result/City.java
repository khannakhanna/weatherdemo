package com.khanna.weather.business.weather.result;


public class City {
	private String name;
	private Long population;
	private Long timezone;
	private Long sunrise;
	private Long sunset;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the population
	 */
	public long getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(long population) {
		this.population = population;
	}
	/**
	 * @return the timezone
	 */
	public long getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(long timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the sunrise
	 */
	public long getSunrise() {
		return sunrise;
	}
	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}
	/**
	 * @return the sunset
	 */
	public long getSunset() {
		return sunset;
	}
	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
	
	
}
