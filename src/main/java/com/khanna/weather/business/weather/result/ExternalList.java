package com.khanna.weather.business.weather.result;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalList {
	private Long dt;
	@JsonProperty("weather")
	private List<ExternalWeather> externalWeather;
	private String dt_txt;

	/**
	 * @return the dt
	 */
	public Long getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(Long dt) {
		this.dt = dt;
	}

	/**
	 * @return the externalWeather
	 */
	public List<ExternalWeather> getExternalWeather() {
		return externalWeather;
	}

	/**
	 * @param externalWeather the externalWeather to set
	 */
	public void setExternalWeather(List<ExternalWeather> externalWeather) {
		this.externalWeather = externalWeather;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExternalList [dt=" + dt + ", externalWeather=" + externalWeather + ", dt_txt=" + dt_txt + "]";
	}

}
