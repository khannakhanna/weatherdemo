package com.khanna.weather.business.weather.result;

import java.util.List;

public class WeatherList {
	private int dt;
	private List<Weather> weather;
	private String dt_txt;
	/**
	 * @return the dt
	 */
	public int getDt() {
		return dt;
	}
	/**
	 * @param dt the dt to set
	 */
	public void setDt(int dt) {
		this.dt = dt;
	}
	
	/**
	 * @return the dt_txt
	 */
	public String getDt_txt() {
		return dt_txt;
	}
	/**
	 * @param dt_txt the dt_txt to set
	 */
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	/**
	 * @return the weather
	 */
	public List<Weather> getWeather() {
		return weather;
	}
	/**
	 * @param weather the weather to set
	 */
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	
	
}
