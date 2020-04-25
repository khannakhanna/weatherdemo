package com.khanna.weather.business.weather.result;

import java.util.List;

public class WeatherResult {
	private City city;
	private Integer cnt;
	private List<WeatherList> list;

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the cnt
	 */
	public int getCnt() {
		return cnt;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	/**
	 * @return the list
	 */
	/**
	 * @return the list
	 */
	public List<WeatherList> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<WeatherList> list) {
		this.list = list;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

}
