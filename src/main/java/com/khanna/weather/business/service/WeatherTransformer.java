package com.khanna.weather.business.service;

import com.khanna.weather.business.weather.result.ExternalWeatherApiResult;
import com.khanna.weather.entity.Weather;

public interface WeatherTransformer {
	public void toTransform(Weather weather, ExternalWeatherApiResult externalWeatherApiResult);
}
