/**
 * 
 */
package com.khanna.weather.business.service;

import java.io.UnsupportedEncodingException;

import org.springframework.http.ResponseEntity;

import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;

/**
 * @author khanna
 *
 */
public interface WeatherApiService {

	public ResponseEntity<ExternalWeatherApiResult> getCountryWeather(String countryName) throws UnsupportedEncodingException;

}
