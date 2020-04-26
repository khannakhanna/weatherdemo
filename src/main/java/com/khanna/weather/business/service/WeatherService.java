package com.khanna.weather.business.service;

import java.io.UnsupportedEncodingException;

import com.khanna.weather.entity.Weather;

public interface WeatherService {
	public Weather getWeatherDetails(String cityName) throws UnsupportedEncodingException;
}
