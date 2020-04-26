package com.khanna.weather.business.weather.result;

public class ExternalCity {
	private String name;
	private String country;
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the population
	 */
	public Long getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(Long population) {
		this.population = population;
	}

	/**
	 * @return the timezone
	 */
	public Long getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the sunrise
	 */
	public Long getSunrise() {
		return sunrise;
	}

	/**
	 * @param sunrise the sunrise to set
	 */
	public void setSunrise(Long sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * @return the sunset
	 */
	public Long getSunset() {
		return sunset;
	}

	/**
	 * @param sunset the sunset to set
	 */
	public void setSunset(Long sunset) {
		this.sunset = sunset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExternalCity [name=" + name + ", country=" + country + ", population=" + population + ", timezone="
				+ timezone + ", sunrise=" + sunrise + ", sunset=" + sunset + "]";
	}

}
