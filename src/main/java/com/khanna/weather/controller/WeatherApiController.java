package com.khanna.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khanna.weather.business.service.WeatherService;
import com.khanna.weather.entity.Weather;

@RestController
@RequestMapping("/api")
public class WeatherApiController {

	@Autowired
	WeatherService weatherService;

	@GetMapping("/weather")
	@ResponseBody
	public Weather getWeatherDetails(
			@RequestParam(name = "city", required = false, defaultValue = "singapore") String cityName) throws Exception {
		return weatherService.getWeatherDetails(cityName);
	}

}
