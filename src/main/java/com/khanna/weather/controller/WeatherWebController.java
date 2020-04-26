package com.khanna.weather.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khanna.weather.business.service.WeatherService;
import com.khanna.weather.entity.Weather;

@Controller
@RequestMapping("/")
public class WeatherWebController {

	@Autowired
	WeatherService weatherService;

	@GetMapping("/weather")
	public String getWeatherDetails(@RequestParam(value = "city", defaultValue = "singapore") String cityName,
			Model model) throws UnsupportedEncodingException {
		Weather weather = weatherService.getWeatherDetails(cityName);
		model.addAttribute("weather", weather);
		return "weather";
	}
}
