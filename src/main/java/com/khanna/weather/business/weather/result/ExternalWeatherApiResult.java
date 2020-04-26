package com.khanna.weather.business.weather.result;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExternalWeatherApiResult {
	@JsonProperty("city")
	private ExternalCity externalCity;
	private Integer cnt;
	@JsonProperty("list")
	private List<ExternalList> externalList;

	/**
	 * @return the externalCity
	 */
	public ExternalCity getExternalCity() {
		return externalCity;
	}

	/**
	 * @param externalCity the externalCity to set
	 */
	public void setExternalCity(ExternalCity externalCity) {
		this.externalCity = externalCity;
	}

	/**
	 * @return the cnt
	 */
	public Integer getCnt() {
		return cnt;
	}

	/**
	 * @param cnt the cnt to set
	 */
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	/**
	 * @return the externalList
	 */
	public List<ExternalList> getExternalList() {
		return externalList;
	}

	/**
	 * @param externalList the externalList to set
	 */
	public void setExternalList(List<ExternalList> externalList) {
		this.externalList = externalList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExternalWeatherApiResult [externalCity=" + externalCity + ", cnt=" + cnt + ", externalList="
				+ externalList + "]";
	}

}
