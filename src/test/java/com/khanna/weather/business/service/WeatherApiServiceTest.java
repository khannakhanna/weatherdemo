/**
 * 
 */
package com.khanna.weather.business.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.khanna.weather.business.utils.DateUtils;
import com.khanna.weather.business.weather.result.ExternalList;
import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;
import com.khanna.weather.entity.Weather;

/**
 * @author khanna
 *
 */
@SpringBootTest
public class WeatherApiServiceTest {

	Logger logger = LoggerFactory.getLogger(WeatherApiServiceTest.class);
	@Autowired
	private WeatherApiService weatherApiService;
	
	@Autowired
	private WeatherService weatherService;

	@Test
	public void getCountryWeatherWithValidValue() {
		String countryName = "singapore";
		try {
			ResponseEntity<ExternalWeatherApiResult> response = weatherApiService.getCountryWeather(countryName);
			logger.info(response.getBody().toString());

			ExternalWeatherApiResult result = response.getBody();
			List<ExternalList> externalLists = result.getExternalList();
			// externalLists.forEach((weatherList) -> logger.info(DateUtils.getDateText(weatherList.getDt())));

			assertEquals(200, response.getStatusCodeValue());
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());

		}
	}
	
	@Test
	public void testMethod2() {
		String city = "singapore";
		try {
			Weather weather = weatherService.getWeatherDetails(city);
			logger.info(weather.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
