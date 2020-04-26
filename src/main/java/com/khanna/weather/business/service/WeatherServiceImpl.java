package com.khanna.weather.business.service;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;
import com.khanna.weather.entity.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	WeatherApiService weatherApiService;
	
	@Autowired
	WeatherTransformer weatherTransformer;
	
	public Weather getWeatherDetails(String cityName) throws UnsupportedEncodingException {
		ResponseEntity<ExternalWeatherApiResult> response=weatherApiService.getCountryWeather(cityName);
		
		ExternalWeatherApiResult externalWeatherApiResult = response.getBody();
		Weather weather = new Weather();
		weatherTransformer.toTransform(weather, externalWeatherApiResult);
		return weather;
	}
}
