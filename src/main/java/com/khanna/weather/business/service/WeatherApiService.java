/**
 * 
 */
package com.khanna.weather.business.service;

import java.io.UnsupportedEncodingException;

import org.springframework.http.ResponseEntity;

/**
 * @author khanna
 *
 */
public interface WeatherApiService {

	public ResponseEntity<String> getCountryWeather(String countryName) throws UnsupportedEncodingException;

}
