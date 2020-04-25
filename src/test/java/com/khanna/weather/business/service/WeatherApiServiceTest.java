/**
 * 
 */
package com.khanna.weather.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.khanna.weather.business.weather.result.WeatherResult;

/**
 * @author khanna
 *
 */
@SpringBootTest
public class WeatherApiServiceTest {
	
	Logger logger =LoggerFactory.getLogger(WeatherApiServiceTest.class);
	@Autowired
	private WeatherApiService weatherApiService;
	
	@Test
	public void getCountryWeatherWithValidValue() {
		String countryName= "singapore";
		try {
			ResponseEntity<WeatherResult> response = weatherApiService.getCountryWeather(countryName);
			logger.info(response.getBody().toString());
			
			assertEquals(200, response.getStatusCodeValue());
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
			
		}
	}
	
//	@Test
//	public void getCountryWeatherWithNullValue() {
//		String countryName= "null";
//		try {
//			ResponseEntity<String> response = weatherApiService.getCountryWeather(countryName);
//			logger.info(response.getBody());
//			assertEquals(200, response.getStatusCodeValue());
//		} catch (UnsupportedEncodingException e) {
//			logger.error(e.toString());
//			
//		}
//	}
}
